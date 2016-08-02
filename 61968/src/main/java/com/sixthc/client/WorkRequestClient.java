package com.sixthc.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.log4j.Logger;

import ch.iec.tc57._2010.schema.message.HeaderType;
import ch.iec.tc57._2010.schema.message.ReplyType;
import ch.iec.tc57._2010.schema.message.RequestType;
import ch.iec.tc57._2010.workrequest.FaultMessage;
import ch.iec.tc57._2010.workrequest.RequestWorkRequest;
import ch.iec.tc57._2010.workrequest.WorkRequestPort;
import ch.iec.tc57._2010.workrequestmessage.WorkRequestPayloadType;
import ch.iec.tc57._2010.workrequestmessage.WorkRequestRequestMessageType;
import ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsPayloadType;


public class WorkRequestClient extends RequestClient {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(WorkRequestClient.class);
	private static final QName SERVICE_NAME = new QName(
			"http://iec.ch/TC57/2010/WorkRequest", "RequestWorkRequest");
	URL wsdlURL = WorkRequestClient.class
			.getResource("/resources/wsdl/61968-6/RequestWorkRequest.wsdl");

	private Holder<HeaderType> header = new Holder<HeaderType>();
	private Holder<WorkRequestPayloadType> payload = new Holder<WorkRequestPayloadType>();
	private Holder<ReplyType> reply = new Holder<ReplyType>();
	RequestType request = new RequestType();

	private WorkRequestClient() {

	}

	public WorkRequestClient(HeaderType header, WorkRequestPayloadType payload) {
		this.header.value = header;
		this.payload.value = payload;
	}

	public void create() throws FaultMessage {
		String address = header.value.getReplyAddress();
		log.info("Request(RequestWorkRequest) client");

		log.debug("wsdlURL " + wsdlURL);
		log.debug("SERVICE_NAME " + SERVICE_NAME);
		RequestWorkRequest ss = new RequestWorkRequest(wsdlURL, SERVICE_NAME);
		WorkRequestPort port = ss.getWorkRequestPort();
		BindingProvider provider = (BindingProvider) port;
		log.debug("end point address " + address);
		provider.getRequestContext().put(
				BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
		WorkRequestRequestMessageType msg = new WorkRequestRequestMessageType();

		// Register all the logging interceptors
		Client cxfClient = ClientProxy.getClient(port);

		cxfClient.getInInterceptors().add(loggingInInterceptor);
		cxfClient.getInFaultInterceptors().add(loggingInFaultInterceptor);
		cxfClient.getOutInterceptors().add(loggingOutInterceptor);
		cxfClient.getOutFaultInterceptors().add(loggingOutFaultInterceptor);

		// execute client request
		reply.value = new ReplyType();
		reply.value.setResult("OK");

		port.createWorkRequest(header, request, payload, reply);
	}

	public HeaderType getHeader() {
		return header.value;
	}

	public void setHeader(HeaderType header) {
		this.header.value = header;
	}

	public WorkRequestPayloadType getPayload() {
		return payload.value;
	}

	public void setPayload(WorkRequestPayloadType payload) {
		this.payload.value = payload;
	}

}
