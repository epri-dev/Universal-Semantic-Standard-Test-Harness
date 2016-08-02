package com.sixthc.server.ws;

import javax.xml.ws.Holder;

import org.apache.log4j.Logger;

import ch.iec.tc57._2011.meterservicerequests.FaultMessage;
import ch.iec.tc57._2011.meterservicerequests.ReplyMeterServiceRequestsPort;
import ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsEventMessageType;
import ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType;
import ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsResponseMessageType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;

public class ReplyMeterServiceRequestsImpl implements
		ReplyMeterServiceRequestsPort {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(ReplyMeterServiceRequestsImpl.class);



	@Override
	public void closedMeterServiceRequests(Holder<HeaderType> header,
			Holder<MeterServiceRequestsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletedMeterServiceRequests(Holder<HeaderType> header,
			Holder<MeterServiceRequestsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub

	}

	@Override
	public void changedMeterServiceRequests(Holder<HeaderType> header,
			Holder<MeterServiceRequestsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub

	}

	@Override
	public void createdMeterServiceRequests(Holder<HeaderType> header,
			Holder<MeterServiceRequestsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {

		reply.value = new ReplyType();
		reply.value.setResult("OK");

	}

	@Override
	public void canceledMeterServiceRequests(Holder<HeaderType> header,
			Holder<MeterServiceRequestsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub

	}

}
