/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.sixthc.interceptor;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.cxf.common.injection.NoJSR250Annotations;
import org.apache.cxf.common.logging.LogUtils;
import org.apache.cxf.interceptor.AbstractLoggingInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.LoggingMessage;
import org.apache.cxf.interceptor.StaxOutInterceptor;
import org.apache.cxf.io.CacheAndWriteOutputStream;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.io.CachedOutputStreamCallback;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixthc.dao.EpriLogDao;
import com.sixthc.model.EpriLog;

/**
 * 
 */
@NoJSR250Annotations
public class LoggingOutInterceptor extends AbstractLoggingInterceptor {
	private String vendorRoleType = null;
	private String interfaceName = null;
	private String packageName = null;
	private String resultCode = null;
	private String stage = null;
	private static final Logger LOG = LogUtils
			.getLogger(LoggingOutInterceptor.class);
	private static final String LOG_SETUP = LoggingOutInterceptor.class
			.getName() + ".log-setup";
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger
	.getLogger(LoggingOutInterceptor.class);

	@Autowired
	private EpriLogDao epriLogDao;
	EpriLog epriLog = new EpriLog();
	
	public LoggingOutInterceptor(String phase) {
		super(phase);
		addBefore(StaxOutInterceptor.class.getName());
	}

	public LoggingOutInterceptor() {
		this(Phase.PRE_STREAM);
	}

	public LoggingOutInterceptor(int lim) {
		this();
		limit = lim;
	}

	public LoggingOutInterceptor(PrintWriter w) {
		this();
		this.writer = w;
	}

	public void handleMessage(Message message) throws Fault {
		final OutputStream os = message.getContent(OutputStream.class);
		if (os == null) {
			return;
		}
		if (getLogger().isLoggable(Level.INFO) || writer != null) {
			// Write the output while caching it for the log message
			boolean hasLogged = message.containsKey(LOG_SETUP);
			if (!hasLogged) {
				message.put(LOG_SETUP, Boolean.TRUE);
				final CacheAndWriteOutputStream newOut = new CacheAndWriteOutputStream(
						os);
				message.setContent(OutputStream.class, newOut);
				newOut.registerCallback(new LoggingCallback(message, os));
			}
		}
	}

	class LoggingCallback implements CachedOutputStreamCallback {

		private final Message message;
		private final OutputStream origStream;

		public LoggingCallback(final Message msg, final OutputStream os) {
			this.message = msg;
			this.origStream = os;
		}

		public void onFlush(CachedOutputStream cos) {

		}

		public void onClose(CachedOutputStream cos) {
			
			log.debug("onClose");
			String id = (String) message.getExchange().get(
					LoggingMessage.ID_KEY);
			if (id == null) {
				id = LoggingMessage.nextId();
				message.getExchange().put(LoggingMessage.ID_KEY, id);
			}
			final LoggingMessage buffer = new LoggingMessage(
					"Outbound Message\n---------------------------", id);
			epriLog.setMessageId(id);
			
			// link up with correct interface
			epriLog.setVendorRoleTypeName(getVendorRoleType());
			epriLog.setPackageName(getPackageName());
			epriLog.setInterfaceName(getInterfaceName());
			epriLogDao.setInterface(epriLog);
			epriLog.setStage(stage);

			
			Integer responseCode = (Integer) message.get(Message.RESPONSE_CODE);
			if (responseCode != null) {
				epriLog.setResponseCode(String.valueOf(responseCode));
			}

			String encoding = (String) message.get(Message.ENCODING);

			if (encoding != null) {
				epriLog.setEncoding(encoding);
			}
			String httpMethod = (String) message
					.get(Message.HTTP_REQUEST_METHOD);
			if (httpMethod != null) {
				epriLog.setHttpMethod(httpMethod);
			}
			String address = (String) message.get(Message.ENDPOINT_ADDRESS);
			if (address != null) {
				buffer.getAddress().append(address);
			}
			String ct = (String) message.get(Message.CONTENT_TYPE);
			if (ct != null) {
				epriLog.setContentType(ct);
			}
			Object headers = message.get(Message.PROTOCOL_HEADERS);
			if (headers != null) {
				epriLog.setHeader(headers.toString());
			}

			if (cos.getTempFile() == null) {
				// buffer.append("Outbound Message:\n");
				if (cos.size() > limit) {
					buffer.getMessage().append(
							"(message truncated to " + limit + " bytes)\n");
				}
			} else {
				buffer.getMessage().append(
						"Outbound Message (saved to tmp file):\n");
				buffer.getMessage().append(
						"Filename: " + cos.getTempFile().getAbsolutePath()
								+ "\n");
				if (cos.size() > limit) {
					buffer.getMessage().append(
							"(message truncated to " + limit + " bytes)\n");
				}
			}
			try {
				StringBuilder payload = new StringBuilder();

				writePayload(payload, cos, encoding, ct);
				buffer.getPayload().append(payload);
				epriLog.setPayload(payload.toString());

			} catch (Exception ex) {
				// ignore
			}

			epriLog.setResultCode(resultCode);
			epriLogDao.save(epriLog);
			log(buffer.toString());
			try {
				// empty out the cache
				cos.lockOutputStream();
				cos.resetOut(null, false);
			} catch (Exception ex) {
				// ignore
			}
			message.setContent(OutputStream.class, origStream);
		}
	}

	public String getVendorRoleType() {
		return vendorRoleType;
	}

	public void setVendorRoleType(String vendorRoleType) {
		this.vendorRoleType = vendorRoleType;
	}

	public String getInterfaceName() {
		return interfaceName;
	}

	public void setInterfaceName(String iface) {
		this.interfaceName = iface;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String pkg) {
		this.packageName = pkg;
	}

	@Override
	protected Logger getLogger() {
		return LOG;
	}
	
	public void setResultCode(String rc) {
		this.resultCode = rc;
	}
	
	public void setStage(String stage) {
		this.stage = stage;
	}

}
