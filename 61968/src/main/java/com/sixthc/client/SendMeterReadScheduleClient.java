package com.sixthc.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import ch.iec.tc57._2011.meterreadschedule.FaultMessage;
import ch.iec.tc57._2011.meterreadschedule.SendMeterReadSchedule;
import ch.iec.tc57._2011.meterreadschedule.SendMeterReadSchedulePort;
import ch.iec.tc57._2011.meterreadschedulemessage.MeterReadScheduleEventMessageType;
import ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;


@Component
public class SendMeterReadScheduleClient extends RequestClient {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(SendMeterReadScheduleClient.class);

    private static final QName SERVICE_NAME = new QName("http://iec.ch/TC57/2011/MeterReadSchedule", "SendMeterReadSchedule");
    

	URL wsdlURL = SendMeterReadScheduleClient.class
			.getResource("/resources/wsdl/SendMeterReadSchedule.wsdl");
	private Holder<HeaderType> header = new Holder<HeaderType>();
	private Holder<MeterReadSchedulePayloadType> payload = new Holder<MeterReadSchedulePayloadType>();
	private Holder<ReplyType> reply = new Holder<ReplyType>();

	public SendMeterReadScheduleClient() {
		super();
	}

	public SendMeterReadScheduleClient(HeaderType header,
			MeterReadSchedulePayloadType payload) {
		this.header.value = header;
		this.payload.value = payload;
	}

	public void create() throws FaultMessage {
		String address = header.value.getReplyAddress();
		log.info("Reply(MeterReadSchedule) client");

		log.debug("wsdlURL " + wsdlURL);
		log.debug("SERVICE_NAME " + SERVICE_NAME);
		SendMeterReadSchedule ss = new SendMeterReadSchedule(wsdlURL,
				SERVICE_NAME);
		SendMeterReadSchedulePort port = ss.getSendMeterReadSchedulePort();
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
