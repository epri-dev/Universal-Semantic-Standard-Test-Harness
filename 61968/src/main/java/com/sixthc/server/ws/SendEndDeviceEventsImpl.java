package com.sixthc.server.ws;

import javax.xml.ws.Holder;

import org.apache.log4j.Logger;

import ch.iec.tc57._2011.enddeviceevents.FaultMessage;
import ch.iec.tc57._2011.enddeviceevents.SendEndDeviceEventsPort;
import ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsPayloadType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;

import com.sixthc.client.SendEndDeviceEventsClient;

public class SendEndDeviceEventsImpl implements SendEndDeviceEventsPort {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(SendEndDeviceEventsImpl.class);

	@Override
	public void canceledEndDeviceEvents(Holder<HeaderType> header,
			Holder<EndDeviceEventsPayloadType> payload, Holder<ReplyType> reply)
			throws FaultMessage {
		reply.value = new ReplyType();
		reply.value.setResult("OK");

	}

	@Override
	public void deletedEndDeviceEvents(Holder<HeaderType> header,
			Holder<EndDeviceEventsPayloadType> payload, Holder<ReplyType> reply)
			throws FaultMessage {
		reply.value = new ReplyType();
		reply.value.setResult("OK");

	}

	@Override
	public void changedEndDeviceEvents(Holder<HeaderType> header,
			Holder<EndDeviceEventsPayloadType> payload, Holder<ReplyType> reply)
			throws FaultMessage {
		reply.value = new ReplyType();
		reply.value.setResult("OK");

	}

	@Override
	public void createdEndDeviceEvents(Holder<HeaderType> header,
			Holder<EndDeviceEventsPayloadType> payload, Holder<ReplyType> reply)
			throws FaultMessage {

		reply.value = new ReplyType();
		reply.value.setResult("OK");

	}

	@Override
	public void closedEndDeviceEvents(Holder<HeaderType> header,
			Holder<EndDeviceEventsPayloadType> payload, Holder<ReplyType> reply)
			throws FaultMessage {
		reply.value = new ReplyType();
		reply.value.setResult("OK");

	}
}
