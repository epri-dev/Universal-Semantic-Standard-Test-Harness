package com.sixthc.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import ch.iec.tc57._2011.meterreadings.FaultMessage;
import ch.iec.tc57._2011.meterreadings.SendMeterReadings;
import ch.iec.tc57._2011.meterreadings.SendMeterReadingsPort;
import ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsEventMessageType;
import ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;

@Component
public class SendMeterReadingsClient extends RequestClient {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(SendMeterReadingsClient.class);

    private static final QName SERVICE_NAME = new QName("http://iec.ch/TC57/2011/MeterReadings", "SendMeterReadings");
    

	URL wsdlURL = SendMeterReadingsClient.class
			.getResource("/resources/wsdl/SendMeterReadings.wsdl");
	private Holder<HeaderType> header = new Holder<HeaderType>();
	private Holder<MeterReadingsPayloadType> payload = new Holder<MeterReadingsPayloadType>();
	private Holder<ReplyType> reply = new Holder<ReplyType>();

	public SendMeterReadingsClient() {
		super();
	}

	public SendMeterReadingsClient(HeaderType header,
			MeterReadingsPayloadType payload) {
		this.header.value = header;
		this.payload.value = payload;
	}

	public void create() throws FaultMessage {
		String address = header.value.getReplyAddress();
		log.info("Send(MeterReadings) client");

		log.debug("wsdlURL " + wsdlURL);
		log.debug("SERVICE_NAME " + SERVICE_NAME);
		SendMeterReadings ss = new SendMeterReadings(wsdlURL,
				SERVICE_NAME);
		SendMeterReadingsPort port = ss.getSendMeterReadingsPort();
		BindingProvider provider = (BindingProvider) port;
		log.debug("end point address " + address);
		provider.getRequestContext().put(
				BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
		MeterReadingsEventMessageType msg = new MeterReadingsEventMessageType();

		// Register all the logging interceptors
		Client cxfClient = ClientProxy.getClient(port);

		cxfClient.getInInterceptors().add(loggingInInterceptor);
		cxfClient.getInFaultInterceptors().add(loggingInFaultInterceptor);
		cxfClient.getOutInterceptors().add(loggingOutInterceptor);
		cxfClient.getOutFaultInterceptors().add(loggingOutFaultInterceptor);

		// execute client request
		reply.value = new ReplyType();
		reply.value.setResult("OK");
		port.createdMeterReadings(header, payload, reply);

	}
	
	public void execute(String cmd) throws FaultMessage {
		String address = header.value.getReplyAddress();
		log.info("Send(MeterReadings) client");

		log.debug("wsdlURL " + wsdlURL);
		log.debug("SERVICE_NAME " + SERVICE_NAME);
		SendMeterReadings ss = new SendMeterReadings(wsdlURL,
				SERVICE_NAME);
		SendMeterReadingsPort port = ss.getSendMeterReadingsPort();
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

		// execute client request
		reply.value = new ReplyType();
		reply.value.setResult("OK");

		CommandType command = CommandType.valueOf(cmd);
		switch (command) {
		case CANCELED:
			port.canceledMeterReadings(header, payload, reply);
			break;
		case CREATED:
			port.createdMeterReadings(header, payload, reply);
			break;
		case CHANGED:
			port.changedMeterReadings(header, payload, reply);
			break;
		case CLOSED:
			port.closedMeterReadings(header, payload, reply);
			break;
		case DELETED:
			port.deletedMeterReadings(header, payload, reply);
			break;
		default:
			throw new FaultMessage("Illegal Command");
		}
	}

	public HeaderType getHeader() {
		return header.value;
	}

	public void setHeader(HeaderType header) {
		this.header.value = header;
	}

	public MeterReadingsPayloadType getPayload() {
		return payload.value;
	}

	public void setPayload(MeterReadingsPayloadType payload) {
		this.payload.value = payload;
	}
}
