package com.sixthc.server.ws;

import javax.xml.ws.Holder;

import org.apache.log4j.Logger;

import ch.iec.tc57._2011.meterreadschedule.FaultMessage;
import ch.iec.tc57._2011.meterreadschedule.SendMeterReadSchedulePort;
import ch.iec.tc57._2011.meterreadschedulemessage.MeterReadScheduleEventMessageType;
import ch.iec.tc57._2011.meterreadschedulemessage.MeterReadSchedulePayloadType;
import ch.iec.tc57._2011.meterreadschedulemessage.MeterReadScheduleResponseMessageType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;

public class SendMeterReadScheduleImpl implements SendMeterReadSchedulePort {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(SendMeterReadScheduleImpl.class);

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
