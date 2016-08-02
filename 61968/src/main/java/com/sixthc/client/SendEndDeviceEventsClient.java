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
import ch.iec.tc57._2011.enddeviceevents.SendEndDeviceEvents;
import ch.iec.tc57._2011.enddeviceevents.SendEndDeviceEventsPort;
import ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsEventMessageType;
import ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsPayloadType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;




@Component
public class SendEndDeviceEventsClient extends RequestClient {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(SendEndDeviceEventsClient.class);

    private static final QName SERVICE_NAME = new QName("http://iec.ch/TC57/2011/EndDeviceEvents", "SendEndDeviceEvents");
    

	URL wsdlURL = SendEndDeviceEventsClient.class
			.getResource("/resources/wsdl/SendEndDeviceEvents.wsdl");
	private Holder<HeaderType> header = new Holder<HeaderType>();
	private Holder<EndDeviceEventsPayloadType> payload = new Holder<EndDeviceEventsPayloadType>();
	private Holder<ReplyType> reply = new Holder<ReplyType>();

	public SendEndDeviceEventsClient() {
		super();
	}

	public SendEndDeviceEventsClient(HeaderType header,
			EndDeviceEventsPayloadType payload) {
		this.header.value = header;
		this.payload.value = payload;
	}

	public void create() throws FaultMessage {
		String address = header.value.getReplyAddress();
		log.info("Reply(EndDeviceEvents) client");

		log.debug("wsdlURL " + wsdlURL);
		log.debug("SERVICE_NAME " + SERVICE_NAME);
		SendEndDeviceEvents ss = new SendEndDeviceEvents(wsdlURL,
				SERVICE_NAME);
		SendEndDeviceEventsPort port = ss.getSendEndDeviceEventsPort();
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

		// execute client request
		reply.value = new ReplyType();
		reply.value.setResult("OK");
		port.createdEndDeviceEvents(header, payload, reply);

	}
	
	

	public HeaderType getHeader() {
		return header.value;
	}

	public void setHeader(HeaderType header) {
		this.header.value = header;
	}

	public EndDeviceEventsPayloadType getPayload() {
		return payload.value;
	}

	public void setPayload(EndDeviceEventsPayloadType payload) {
		this.payload.value = payload;
	}
}
