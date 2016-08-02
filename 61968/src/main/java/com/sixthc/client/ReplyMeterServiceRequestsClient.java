package com.sixthc.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import ch.iec.tc57._2011.meterservicerequests.FaultMessage;
import ch.iec.tc57._2011.meterservicerequests.ReplyMeterServiceRequests;
import ch.iec.tc57._2011.meterservicerequests.ReplyMeterServiceRequestsPort;
import ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsEventMessageType;
import ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;

@Component
public class ReplyMeterServiceRequestsClient extends RequestClient {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(ReplyMeterServiceRequestsClient.class);

	private static final QName SERVICE_NAME = new QName(
			"http://iec.ch/TC57/2011/MeterServiceRequests",
			"ReplyMeterServiceRequests");

	URL wsdlURL = ReplyMeterServiceRequestsClient.class
			.getResource("/resources/wsdl/ReplyMeterServiceRequests.wsdl");

	private Holder<HeaderType> header = new Holder<HeaderType>();
	private Holder<MeterServiceRequestsPayloadType> payload = new Holder<MeterServiceRequestsPayloadType>();
	private Holder<ReplyType> reply = new Holder<ReplyType>();

	public ReplyMeterServiceRequestsClient() {
		super();
	}

	public ReplyMeterServiceRequestsClient(HeaderType header,
			MeterServiceRequestsPayloadType payload) {
		this.header.value = header;
		this.payload.value = payload;
	}

	public void create() throws FaultMessage {
		String address = header.value.getReplyAddress();

		log.info("Reply(MeterServiceRequest) client");

		log.debug("sendCreated called");
		log.debug("wsdlURL " + wsdlURL);
		log.debug("SERVICE_NAME " + SERVICE_NAME);
		ReplyMeterServiceRequests ss = new ReplyMeterServiceRequests(wsdlURL,
				SERVICE_NAME);
		ReplyMeterServiceRequestsPort port = ss
				.getReplyMeterServiceRequestsPort();
		BindingProvider provider = (BindingProvider) port;
		provider.getRequestContext().put(
				BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);

		// Register all the logging interceptors
		Client cxfClient = ClientProxy.getClient(port);

		cxfClient.getInInterceptors().add(loggingInInterceptor);
		cxfClient.getInFaultInterceptors().add(loggingInFaultInterceptor);
		cxfClient.getOutInterceptors().add(loggingOutInterceptor);
		cxfClient.getOutFaultInterceptors().add(loggingOutFaultInterceptor);

		// execute client request
		reply.value = new ReplyType();
		reply.value.setResult("OK");
		port.createdMeterServiceRequests(header, payload, reply);
	}


	public void change() throws FaultMessage {

		String address = header.value.getReplyAddress();
		log.info("Reply change client call");

		log.info("Change(MeterServiceRequest) client");

		log.debug("sendCreated called");
		log.debug("wsdlURL " + wsdlURL);
		log.debug("SERVICE_NAME " + SERVICE_NAME);
		ReplyMeterServiceRequests ss = new ReplyMeterServiceRequests(wsdlURL,
				SERVICE_NAME);
		ReplyMeterServiceRequestsPort port = ss
				.getReplyMeterServiceRequestsPort();
		BindingProvider provider = (BindingProvider) port;
		provider.getRequestContext().put(
				BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
		MeterServiceRequestsEventMessageType msg = new MeterServiceRequestsEventMessageType();

		// Register all the logging interceptors
		Client cxfClient = ClientProxy.getClient(port);

		cxfClient.getInInterceptors().add(loggingInInterceptor);
		cxfClient.getInFaultInterceptors().add(loggingInFaultInterceptor);
		cxfClient.getOutInterceptors().add(loggingOutInterceptor);
		cxfClient.getOutFaultInterceptors().add(loggingOutFaultInterceptor);

		// execute client request
		reply.value = new ReplyType();
		reply.value.setResult("OK");
		port.changedMeterServiceRequests(header, payload, reply);
	}

	public HeaderType getHeader() {
		return header.value;
	}

	public void setHeader(HeaderType header) {
		this.header.value = header;
	}

	public MeterServiceRequestsPayloadType getPayload() {
		return payload.value;
	}

	public void setPayload(MeterServiceRequestsPayloadType payload) {
		this.payload.value = payload;
	}
}
