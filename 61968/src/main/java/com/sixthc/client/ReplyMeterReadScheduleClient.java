package com.sixthc.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.headers.Header;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import ch.iec.tc57._2011.meterreadschedule.FaultMessage;
import ch.iec.tc57._2011.meterreadschedule.ReplyMeterReadSchedule;
import ch.iec.tc57._2011.meterreadschedule.ReplyMeterReadSchedulePort;
import ch.iec.tc57._2011.meterreadschedulemessage.MeterReadScheduleEventMessageType;
import ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;

@Component
public class ReplyMeterReadScheduleClient extends RequestClient {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(ReplyMeterReadScheduleClient.class);

    private static final QName SERVICE_NAME = new QName("http://iec.ch/TC57/2011/MeterReadSchedule", "ReplyMeterReadSchedule");
    

	URL wsdlURL = ReplyMeterReadScheduleClient.class
			.getResource("/resources/wsdl/ReplyMeterReadSchedule.wsdl");
	private Holder<HeaderType> header = new Holder<HeaderType>();
	private Holder<MeterReadSchedulePayloadType> payload = new Holder<MeterReadSchedulePayloadType>();
	private Holder<ReplyType> reply = new Holder<ReplyType>();

	public ReplyMeterReadScheduleClient() {
		super();
	}

	public ReplyMeterReadScheduleClient(HeaderType header,
			MeterReadSchedulePayloadType payload) {
		this.header.value = header;
		this.payload.value = payload;
	}

	public void create() throws FaultMessage {
		String address = header.value.getReplyAddress();
		log.info("Reply(MeterReadSchedule) client");

		log.debug("wsdlURL " + wsdlURL);
		log.debug("SERVICE_NAME " + SERVICE_NAME);
		ReplyMeterReadSchedule ss = new ReplyMeterReadSchedule(wsdlURL,
				SERVICE_NAME);
		ReplyMeterReadSchedulePort port = ss.getReplyMeterReadSchedulePort();
		BindingProvider provider = (BindingProvider) port;
		log.debug("end point address " + address);
		provider.getRequestContext().put(
				BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
		MeterReadScheduleEventMessageType msg = new MeterReadScheduleEventMessageType();

		// Register all the logging interceptors
		Client cxfClient = ClientProxy.getClient(port);

		cxfClient.getInInterceptors().add(loggingInInterceptor);
		cxfClient.getInFaultInterceptors().add(loggingInFaultInterceptor);
		cxfClient.getOutInterceptors().add(loggingOutInterceptor);
		cxfClient.getOutFaultInterceptors().add(loggingOutFaultInterceptor);

		// execute client request
		reply.value = new ReplyType();
		reply.value.setResult("OK");
		port.createdMeterReadSchedule(header, payload, reply);

	}
	
	public void execute(String cmd) throws FaultMessage {
		String address = header.value.getReplyAddress();
		log.info("Reply(MeterReadSchedule) client");

		log.debug("wsdlURL " + wsdlURL);
		log.debug("SERVICE_NAME " + SERVICE_NAME);
		ReplyMeterReadSchedule ss = new ReplyMeterReadSchedule(wsdlURL,
				SERVICE_NAME);
		ReplyMeterReadSchedulePort port = ss.getReplyMeterReadSchedulePort();
		BindingProvider provider = (BindingProvider) port;
		log.debug("end point address " + address);
		provider.getRequestContext().put(
				BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
		MeterReadScheduleEventMessageType msg = new MeterReadScheduleEventMessageType();

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
			port.canceledMeterReadSchedule(header, payload, reply);
			break;
		case CREATED:
			port.createdMeterReadSchedule(header, payload, reply);
			break;
		case CHANGED:
			port.changedMeterReadSchedule(header, payload, reply);
			break;
		case CLOSED:
			port.closedMeterReadSchedule(header, payload, reply);
			break;
		case DELETED:
			port.deletedMeterReadSchedule(header, payload, reply);
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

	public MeterReadSchedulePayloadType getPayload() {
		return payload.value;
	}

	public void setPayload(MeterReadSchedulePayloadType payload) {
		this.payload.value = payload;
	}
}
