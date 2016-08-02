package com.sixthc.server.ws;

import javax.xml.ws.Holder;

import org.apache.log4j.Logger;

import ch.iec.tc57._2011.meterreadings.FaultMessage;
import ch.iec.tc57._2011.meterreadings.SendMeterReadingsPort;
import ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsEventMessageType;
import ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType;
import ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsResponseMessageType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;

public class SendMeterReadingsImpl implements SendMeterReadingsPort {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(SendMeterReadingsImpl.class);

	@Override
	public void closedMeterReadings(Holder<HeaderType> header,
			Holder<MeterReadingsPayloadType> payload, Holder<ReplyType> reply)
			throws FaultMessage {

		reply.value = new ReplyType();
		reply.value.setResult("OK");

	}

	@Override
	public void changedMeterReadings(Holder<HeaderType> header,
			Holder<MeterReadingsPayloadType> payload, Holder<ReplyType> reply)
			throws FaultMessage {

		reply.value = new ReplyType();
		reply.value.setResult("OK");

	}

	@Override
	public void deletedMeterReadings(Holder<HeaderType> header,
			Holder<MeterReadingsPayloadType> payload, Holder<ReplyType> reply)
			throws FaultMessage {

		reply.value = new ReplyType();
		reply.value.setResult("OK");

	}

	@Override
	public void canceledMeterReadings(Holder<HeaderType> header,
			Holder<MeterReadingsPayloadType> payload, Holder<ReplyType> reply)
			throws FaultMessage {

		reply.value = new ReplyType();
		reply.value.setResult("OK");

	}

	@Override
	public void createdMeterReadings(Holder<HeaderType> header,
			Holder<MeterReadingsPayloadType> payload, Holder<ReplyType> reply)
			throws FaultMessage {

		reply.value = new ReplyType();
		reply.value.setResult("OK");

	}

}
