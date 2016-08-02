package com.sixthc.server.ws;

import org.apache.log4j.Logger;

import ch.iec.tc57._2011.meterreadings.GetMeterReadingsPort;
import ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsRequestMessageType;
import ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsResponseMessageType;
import ch.iec.tc57._2011.schema.message.ReplyType;

public class GetMeterReadingsImpl implements GetMeterReadingsPort {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(GetMeterReadingsImpl.class);

	@Override
	public MeterReadingsResponseMessageType getMeterReadings(
			MeterReadingsRequestMessageType msg)
			throws ch.iec.tc57._2011.meterreadings.FaultMessage {
		log.debug("getMeterReadings");
		
		MeterReadingsResponseMessageType resp = new MeterReadingsResponseMessageType();
		resp.setHeader(msg.getHeader());
	
		ReplyType reply = new ReplyType();
		reply.setResult("OK");
		resp.setReply(reply);
		resp.setPayload(msg.getPayload());
		
		return resp;
	}
/*
	@Override
	public MeterReadingsResponseMessageType closedMeterReadings(
			MeterReadingsEventMessageType closedMeterReadingsEventMessage)
			throws ch.iec.tc57._2011.meterreadings.FaultMessage {
		log.debug("closedMeterReadings");
		return null;
	}

	@Override
	public MeterReadingsResponseMessageType changedMeterReadings(
			MeterReadingsEventMessageType changedMeterReadingsEventMessage)
			throws ch.iec.tc57._2011.meterreadings.FaultMessage {
		log.debug("changedMeterReadings");
		return null;
	}

	@Override
	public MeterReadingsResponseMessageType deletedMeterReadings(
			MeterReadingsEventMessageType deletedMeterReadingsEventMessage)
			throws ch.iec.tc57._2011.meterreadings.FaultMessage {
		log.debug("deletedMeterReadings");
		return null;
	}

	@Override
	public MeterReadingsResponseMessageType canceledMeterReadings(
			MeterReadingsEventMessageType canceledMeterReadingsEventMessage)
			throws ch.iec.tc57._2011.meterreadings.FaultMessage {
		log.debug("canceledMeterReadings");
		return null;
	}

	@Override
	public MeterReadingsResponseMessageType createdMeterReadings(
			MeterReadingsEventMessageType msg)
			throws ch.iec.tc57._2011.meterreadings.FaultMessage {
		log.debug("createMeterReadings");

		MeterReadingsResponseMessageType response = new MeterReadingsResponseMessageType();
		ReplyType reply = new ReplyType();
		reply.setResult("OK");
		response.setReply(reply);

		response.setHeader(msg.getHeader());

		return response;
	}
*/

}
