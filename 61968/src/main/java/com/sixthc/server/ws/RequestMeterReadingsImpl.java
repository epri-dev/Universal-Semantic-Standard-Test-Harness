package com.sixthc.server.ws;

import javax.xml.ws.Holder;

import org.apache.log4j.Logger;

import ch.iec.tc57._2011.meterreadings.FaultMessage;
import ch.iec.tc57._2011.meterreadings.RequestMeterReadingsPort;
import ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;
import ch.iec.tc57._2011.schema.message.RequestType;

import com.sixthc.client.ReplyMeterReadingsClient;

public class RequestMeterReadingsImpl implements RequestMeterReadingsPort {
	private static org.apache.log4j.Logger log = Logger
	.getLogger(RequestMeterReadingsImpl.class);

	private ReplyMeterReadingsClient client;

	
	public ReplyMeterReadingsClient getClient() {
		return client;
	}

	public void setClient(ReplyMeterReadingsClient client) {
		this.client = client;
	}

	@Override
	public void createMeterReadings(Holder<HeaderType> header,
			RequestType request, Holder<MeterReadingsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {

		log.debug("createMeterServiceRequests called");

		client.setHeader(header.value);
		client.setPayload(payload.value);
		client.create();

		reply.value = new ReplyType();
		reply.value.setResult("OK");
	}

	@Override
	public void closeMeterReadings(Holder<HeaderType> header,
			RequestType request, Holder<MeterReadingsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeMeterReadings(Holder<HeaderType> header,
			RequestType request, Holder<MeterReadingsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelMeterReadings(Holder<HeaderType> header,
			RequestType request, Holder<MeterReadingsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMeterReadings(Holder<HeaderType> header,
			RequestType request, Holder<MeterReadingsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub
		
	}


}
