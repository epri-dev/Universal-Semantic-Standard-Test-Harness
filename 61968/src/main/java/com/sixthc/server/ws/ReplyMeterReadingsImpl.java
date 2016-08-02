package com.sixthc.server.ws;


import javax.xml.ws.Holder;

import org.apache.log4j.Logger;

import ch.iec.tc57._2011.meterreadings.FaultMessage;
import ch.iec.tc57._2011.meterreadings.ReplyMeterReadingsPort;
import ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsPayloadType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;

public class ReplyMeterReadingsImpl implements ReplyMeterReadingsPort {
	private static org.apache.log4j.Logger log = Logger
	.getLogger(ReplyMeterReadingsImpl.class);

	@Override
	public void closedMeterReadings(Holder<HeaderType> header,
			Holder<MeterReadingsPayloadType> payload, Holder<ReplyType> reply)
			throws FaultMessage {
		log.debug("closedMeterReadings");

	}

	@Override
	public void changedMeterReadings(Holder<HeaderType> header,
			Holder<MeterReadingsPayloadType> payload, Holder<ReplyType> reply)
			throws FaultMessage {
		log.debug("changedMeterReadings");
	}

	@Override
	public void deletedMeterReadings(Holder<HeaderType> header,
			Holder<MeterReadingsPayloadType> payload, Holder<ReplyType> reply)
			throws FaultMessage {
		log.debug("deletedMeterReadings");

	}

	@Override
	public void canceledMeterReadings(Holder<HeaderType> header,
			Holder<MeterReadingsPayloadType> payload, Holder<ReplyType> reply)
			throws FaultMessage {
		log.debug("canceledMeterReadings");

	}

	@Override
	public void createdMeterReadings(Holder<HeaderType> header,
			Holder<MeterReadingsPayloadType> payload, Holder<ReplyType> reply)
			throws FaultMessage {
		log.debug("createdMeterReadings");
		
		reply.value = new ReplyType();
		reply.value.setResult("OK");
	}

}
