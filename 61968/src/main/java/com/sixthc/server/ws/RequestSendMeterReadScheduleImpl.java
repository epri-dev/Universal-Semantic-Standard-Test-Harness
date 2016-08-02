package com.sixthc.server.ws;

import java.util.logging.Logger;

import javax.xml.ws.Holder;

import org.apache.cxf.common.logging.LogUtils;

import ch.iec.tc57._2011.meterreadschedule.FaultMessage;
import ch.iec.tc57._2011.meterreadschedule.SendMeterReadSchedulePort;
import ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;

import com.sixthc.client.SendMeterReadScheduleClient;

public class RequestSendMeterReadScheduleImpl implements
		SendMeterReadSchedulePort {
	private static final Logger log = LogUtils
			.getLogger(RequestSendMeterReadScheduleImpl.class);

	private SendMeterReadScheduleClient client;

	public SendMeterReadScheduleClient getClient() {
		return client;
	}

	public void setClient(SendMeterReadScheduleClient client) {
		this.client = client;
	}

	@Override
	public void closedMeterReadSchedule(Holder<HeaderType> header,
			Holder<MeterReadSchedulePayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changedMeterReadSchedule(Holder<HeaderType> header,
			Holder<MeterReadSchedulePayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createdMeterReadSchedule(Holder<HeaderType> header,
			Holder<MeterReadSchedulePayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {

			client.setHeader(header.value);
			client.setPayload(payload.value);
			client.create();
			
			reply.value = new ReplyType();
			reply.value.setResult("OK");
	}

	@Override
	public void canceledMeterReadSchedule(Holder<HeaderType> header,
			Holder<MeterReadSchedulePayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletedMeterReadSchedule(Holder<HeaderType> header,
			Holder<MeterReadSchedulePayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub
		
	}



}
