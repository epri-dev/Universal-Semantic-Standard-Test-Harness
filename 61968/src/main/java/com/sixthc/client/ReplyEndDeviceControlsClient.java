package com.sixthc.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import ch.iec.tc57._2011.enddevicecontrols.FaultMessage;
import ch.iec.tc57._2011.enddevicecontrols.ReplyEndDeviceControls;
import ch.iec.tc57._2011.enddevicecontrols.ReplyEndDeviceControlsPort;
import ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsEventMessageType;
import ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;


@Component
public class ReplyEndDeviceControlsClient extends RequestClient {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(ReplyEndDeviceControlsClient.class);

	private static final QName SERVICE_NAME = new QName(
			"http://iec.ch/TC57/2011/EndDeviceControls",
			"ReplyEndDeviceControls");

	URL wsdlURL = ReplyEndDeviceControlsClient.class
			.getResource("/resources/wsdl/ReplyEndDeviceControls.wsdl");
	private HeaderType header;
	private EndDeviceControlsPayloadType payload;

	public ReplyEndDeviceControlsClient() {
		super();
	}

	public ReplyEndDeviceControlsClient(HeaderType header,
			EndDeviceControlsPayloadType payload) {
		this.header = header;
		this.payload = payload;
	}

	public void create() throws FaultMessage {
		String address = header.getReplyAddress();
		if( address == null || address.length() < 1 ) {
			throw new FaultMessage("replyAddress not set");
		}
		log.info("Reply(EndDeviceControls) client");

		log.debug("wsdlURL " + wsdlURL);
		log.debug("SERVICE_NAME " + SERVICE_NAME);
		ReplyEndDeviceControls ss = new ReplyEndDeviceControls(wsdlURL,
				SERVICE_NAME);
		ReplyEndDeviceControlsPort port = ss.getReplyEndDeviceControlsPort();
		BindingProvider provider = (BindingProvider) port;
		log.debug("end point address " + address);
		provider.getRequestContext().put(
				BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
		EndDeviceControlsEventMessageType msg = new EndDeviceControlsEventMessageType();
		msg.setHeader(header);
		msg.setPayload(payload);

		// Register all the logging interceptors
		Client cxfClient = ClientProxy.getClient(port);

		cxfClient.getInInterceptors().add(loggingInInterceptor);
		cxfClient.getInFaultInterceptors().add(loggingInFaultInterceptor);
		cxfClient.getOutInterceptors().add(loggingOutInterceptor);
		cxfClient.getOutFaultInterceptors().add(loggingOutFaultInterceptor);

		// execute client request
		Holder<HeaderType> headerHolder = new Holder();
		headerHolder.value = header;
		Holder<EndDeviceControlsPayloadType> payloadHolder = new Holder();
		payloadHolder.value = payload;
		Holder<ReplyType> replyHolder = new Holder();
		replyHolder.value = new ReplyType();
		replyHolder.value.setResult("OK");
		port.createdEndDeviceControls(headerHolder, payloadHolder, replyHolder);

	}
	
	public void execute(String cmd) throws FaultMessage {
		String address = header.getReplyAddress();
		if( address == null || address.length() < 1 ) {
			throw new FaultMessage("replyAddress not set");
		}
		log.info("Reply(EndDeviceControls) client");

		log.debug("wsdlURL " + wsdlURL);
		log.debug("SERVICE_NAME " + SERVICE_NAME);
		ReplyEndDeviceControls ss = new ReplyEndDeviceControls(wsdlURL,
				SERVICE_NAME);
		ReplyEndDeviceControlsPort port = ss.getReplyEndDeviceControlsPort();
		BindingProvider provider = (BindingProvider) port;
		log.debug("end point address " + address);
		provider.getRequestContext().put(
				BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
		EndDeviceControlsEventMessageType msg = new EndDeviceControlsEventMessageType();
		msg.setHeader(header);
		msg.setPayload(payload);

		// Register all the logging interceptors
		Client cxfClient = ClientProxy.getClient(port);

		cxfClient.getInInterceptors().add(loggingInInterceptor);
		cxfClient.getInFaultInterceptors().add(loggingInFaultInterceptor);
		cxfClient.getOutInterceptors().add(loggingOutInterceptor);
		cxfClient.getOutFaultInterceptors().add(loggingOutFaultInterceptor);

		// execute client request
		Holder<HeaderType> headerHolder = new Holder();
		headerHolder.value = header;
		Holder<EndDeviceControlsPayloadType> payloadHolder = new Holder();
		payloadHolder.value = payload;
		Holder<ReplyType> replyHolder = new Holder();
		replyHolder.value = new ReplyType();
		replyHolder.value.setResult("OK");
		
		CommandType command = CommandType.valueOf(cmd);
		switch (command) {
		case CANCELED:
			port.canceledEndDeviceControls(headerHolder, payloadHolder, replyHolder);
			break;
		case CREATED:
			port.createdEndDeviceControls(headerHolder, payloadHolder, replyHolder);
			break;
		case CHANGED:
			port.changedEndDeviceControls(headerHolder, payloadHolder, replyHolder);
			break;
		case CLOSED:
			port.closedEndDeviceControls(headerHolder, payloadHolder, replyHolder);
			break;
		case DELETED:
			port.deletedEndDeviceControls(headerHolder, payloadHolder, replyHolder);
			break;
		default:
			throw new FaultMessage("Illegal Command");
		}
	}

	public HeaderType getHeader() {
		return header;
	}

	public void setHeader(HeaderType header) {
		this.header = header;
	}

	public EndDeviceControlsPayloadType getPayload() {
		return payload;
	}

	public void setPayload(EndDeviceControlsPayloadType payload) {
		this.payload = payload;
	}
}
