package com.sixthc.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import ch.iec.tc57._2011.enddeviceevents.FaultMessage;
import ch.iec.tc57._2011.enddeviceevents.ReplyEndDeviceEvents;
import ch.iec.tc57._2011.enddeviceevents.ReplyEndDeviceEventsPort;
import ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsEventMessageType;
import ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsPayloadType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;

@Component
public class ReplyEndDeviceEventsClient extends RequestClient {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(ReplyEndDeviceEventsClient.class);

	private static final QName SERVICE_NAME = new QName(
			"http://iec.ch/TC57/2011/EndDeviceEvents", "ReplyEndDeviceEvents");

	URL wsdlURL = ReplyEndDeviceEventsClient.class
			.getResource("/resources/wsdl/ReplyEndDeviceEvents.wsdl");
	private Holder<HeaderType> header = new Holder<HeaderType>();
	private Holder<EndDeviceEventsPayloadType> payload = new Holder<EndDeviceEventsPayloadType>();
	private Holder<ReplyType> reply = new Holder<ReplyType>();

	public ReplyEndDeviceEventsClient() {
		super();
	}

	public ReplyEndDeviceEventsClient(HeaderType header,
			EndDeviceEventsPayloadType payload) {
		this.header.value = header;
		this.payload.value = payload;
	}

	public void create() throws FaultMessage {
		String address = header.value.getReplyAddress();
		log.info("Reply(EndDeviceEvents) client");

		log.debug("wsdlURL " + wsdlURL);
		log.debug("SERVICE_NAME " + SERVICE_NAME);
		ReplyEndDeviceEvents ss = new ReplyEndDeviceEvents(wsdlURL,
				SERVICE_NAME);
		ReplyEndDeviceEventsPort port = ss.getReplyEndDeviceEventsPort();
		BindingProvider provider = (BindingProvider) port;
		log.debug("end point address " + address);
		provider.getRequestContext().put(
				BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
		EndDeviceEventsEventMessageType msg = new EndDeviceEventsEventMessageType();

		// Register all the logging interceptors
		Client cxfClient = ClientProxy.getClient(port);

		cxfClient.getInInterceptors().add(loggingInInterceptor);
		cxfClient.getInFaultInterceptors().add(loggingInFaultInterceptor);
		cxfClient.getOutInterceptors().add(loggingOutInterceptor);
		cxfClient.getOutFaultInterceptors().add(loggingOutFaultInterceptor);

		port.createdEndDeviceEvents(header, payload, reply);
	}

	public void execute(String cmd) throws FaultMessage {
		String address = header.value.getReplyAddress();
		log.info("Reply(EndDeviceEvents) client");

		log.debug("wsdlURL " + wsdlURL);
		log.debug("SERVICE_NAME " + SERVICE_NAME);
		ReplyEndDeviceEvents ss = new ReplyEndDeviceEvents(wsdlURL,
				SERVICE_NAME);
		ReplyEndDeviceEventsPort port = ss.getReplyEndDeviceEventsPort();
		BindingProvider provider = (BindingProvider) port;
		log.debug("end point address " + address);
		provider.getRequestContext().put(
				BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);

		// Register all the logging interceptors
		Client cxfClient = ClientProxy.getClient(port);

		cxfClient.getInInterceptors().add(loggingInInterceptor);
		cxfClient.getInFaultInterceptors().add(loggingInFaultInterceptor);
		cxfClient.getOutInterceptors().add(loggingOutInterceptor);
		cxfClient.getOutFaultInterceptors().add(loggingOutFaultInterceptor);

		CommandType command = CommandType.valueOf(cmd);
		switch (command) {
		case CANCELED:
			port.canceledEndDeviceEvents(header, payload, reply);
			break;
		case CREATED:
			port.createdEndDeviceEvents(header, payload, reply);
			break;
		case CHANGED:
			port.changedEndDeviceEvents(header, payload, reply);
			break;
		case CLOSED:
			port.closedEndDeviceEvents(header, payload, reply);
			break;
		case DELETED:
			port.deletedEndDeviceEvents(header, payload, reply);
			break;
		default:
			throw new FaultMessage("Illegal Command");
		}
	}

	public void setHeader(HeaderType header) {
		this.header.value = header;
	}

	public void setPayload(EndDeviceEventsPayloadType payload) {
		this.payload.value = payload;
	}
}
