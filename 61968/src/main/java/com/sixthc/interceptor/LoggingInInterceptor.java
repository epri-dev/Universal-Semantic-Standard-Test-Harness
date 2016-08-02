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

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.cxf.helpers.CastUtils;
import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.interceptor.AbstractLoggingInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.LoggingMessage;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixthc.dao.EpriLogDao;
import com.sixthc.model.EpriLog;

/**
 * A simple logging handler which outputs the bytes of the message to the
 * Logger.
 */
public class LoggingInInterceptor extends AbstractLoggingInterceptor {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(LoggingInInterceptor.class);
	private String vendorRoleType = null;
	private String interfaceName = null;
	private String packageName = null;
	private String resultCode = null;
	private String stage = null;

	@Autowired
	private EpriLogDao epriLogDao;

	EpriLog epriLog = new EpriLog();

	public LoggingInInterceptor() {
		super(Phase.RECEIVE);
	}

	public void handleMessage(Message message) throws Fault {
		logging(message);
	}

	protected void logging(Message message) throws Fault {

		if (message.containsKey(LoggingMessage.ID_KEY)) {
			log.info("returning from logging becuase message has ID");
			return;
		}

		// link up with correct interface
		epriLog.setVendorRoleTypeName(getVendorRoleType());
		epriLog.setPackageName(getPackageName());
		epriLog.setInterfaceName(getInterfaceName());
		epriLogDao.setInterface(epriLog);
		epriLog.setStage(stage);

		String id = (String) message.getExchange().get(LoggingMessage.ID_KEY);
		if (id == null) {
			id = String.valueOf(epriLogDao.getMessageIdSequence());
			log.debug("retrieved sequence message_id => " + id);
			message.getExchange().put(LoggingMessage.ID_KEY, id);
		}

		message.put(LoggingMessage.ID_KEY, id);
		epriLog.setMessageId(id);

		Integer responseCode = (Integer) message.get(Message.RESPONSE_CODE);
		if (responseCode != null) {
			epriLog.setResponseCode(String.valueOf(responseCode));
		}

		String encoding = (String) message.get(Message.ENCODING);

		if (encoding != null) {
			epriLog.setEncoding(encoding);
		}
		String httpMethod = (String) message.get(Message.HTTP_REQUEST_METHOD);
		if (httpMethod != null) {
			epriLog.setHttpMethod(httpMethod);
		}
		String ct = (String) message.get(Message.CONTENT_TYPE);
		if (ct != null) {
			epriLog.setContentType(ct);
		}
		Object headers = message.get(Message.PROTOCOL_HEADERS);
		Map<String, List<String>> headerMap = CastUtils.cast((Map) message
				.get(Message.PROTOCOL_HEADERS));

		if (headerMap != null) {
			List<String> sa = headerMap.get("SOAPAction");
			if (sa != null && sa.size() > 0) {
				String action = sa.get(0);
				if (action.startsWith("\"")) {
					action = action.substring(1, action.length() - 1);
				}
				epriLog.setOperation(action);
			}
		}
		if (headers != null) {
			epriLog.setHeader(headers.toString());
		}
		String uri = (String) message.get(Message.REQUEST_URL);
		if (uri != null) {
			epriLog.setAddress(uri);
			String query = (String) message.get(Message.QUERY_STRING);
			if (query != null) {
				epriLog.setAddress("?" + query);
			}
		}

		InputStream is = message.getContent(InputStream.class);
		if (is != null) {
			CachedOutputStream bos = new CachedOutputStream();
			try {
				StringBuilder payload = new StringBuilder();
				IOUtils.copy(is, bos);

				bos.flush();
				is.close();

				message.setContent(InputStream.class, bos.getInputStream());
				writePayload(payload, bos, encoding, ct);
				epriLog.setPayload(payload.toString());

				bos.close();
			} catch (Exception e) {
				throw new Fault(e);
			}
		}

		epriLog.setResultCode(resultCode);
		epriLogDao.save(epriLog);
		log.debug("DBLog id log = " + epriLog.getId());
	}

	@Override
	public void handleFault(Message message) {
		log.debug("DBLog id fault = " + epriLog.getId());
		super.handleFault(message);
		epriLog.setResultCode("fail");
		epriLogDao.saveOrUpdate(epriLog);
	}

	@Override
	protected java.util.logging.Logger getLogger() {
		// TODO Auto-generated method stub
		return null;
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

	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	
	public void setResultCode(String rc) {
		this.resultCode = rc;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}
}
