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
import ch.iec.tc57._2011.enddevicecontrols.SendEndDeviceControls;
import ch.iec.tc57._2011.enddevicecontrols.SendEndDeviceControlsPort;
import ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsEventMessageType;
import ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;


@Component
public class SendEndDeviceControlsClient extends RequestClient {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(SendEndDeviceControlsClient.class);

    private static final QName SERVICE_NAME = new QName("http://iec.ch/TC57/2011/EndDeviceControls", "SendEndDeviceControls");
    

	URL wsdlURL = SendEndDeviceControlsClient.class
			.getResource("/resources/wsdl/SendEndDeviceControls.wsdl");
	private Holder<HeaderType> header = new Holder<HeaderType>();
	private Holder<EndDeviceControlsPayloadType> payload = new Holder<EndDeviceControlsPayloadType>();
	private Holder<ReplyType> reply = new Holder<ReplyType>();

	public SendEndDeviceControlsClient() {
		super();
	}

	public SendEndDeviceControlsClient(HeaderType header,
			EndDeviceControlsPayloadType payload) {
		this.header.value = header;
		this.payload.value = payload;
	}

	public void create() throws FaultMessage {
		String address = header.value.getReplyAddress();
		log.info("Reply(EndDeviceControls) client");

		log.debug("wsdlURL " + wsdlURL);
		log.debug("SERVICE_NAME " + SERVICE_NAME);
		SendEndDeviceControls ss = new SendEndDeviceControls(wsdlURL,
				SERVICE_NAME);
		SendEndDeviceControlsPort port = ss.getSendEndDeviceControlsPort();
		BindingProvider provider = (BindingProvider) port;
		log.debug("end point address " + address);
		provider.getRequestContext().put(
				BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
		EndDeviceControlsEventMessageType msg = new EndDeviceControlsEventMessageType();

		// Register all the logging interceptors
		Client cxfClient = ClientProxy.getClient(port);

		cxfClient.getInInterceptors().add(loggingInInterceptor);
		cxfClient.getInFaultInterceptors().add(loggingInFaultInterceptor);
		cxfClient.getOutInterceptors().add(loggingOutInterceptor);
		cxfClient.getOutFaultInterceptors().add(loggingOutFaultInterceptor);

		// execute client request
		reply.value = new ReplyType();
		reply.value.setResult("OK");
		port.createdEndDeviceControls(header, payload, reply);

	}
	
	

	public HeaderType getHeader() {
		return header.value;
	}

	public void setHeader(HeaderType header) {
		this.header.value = header;
	}

	public EndDeviceControlsPayloadType getPayload() {
		return payload.value;
	}

	public void setPayload(EndDeviceControlsPayloadType payload) {
		this.payload.value = payload;
	}
}
