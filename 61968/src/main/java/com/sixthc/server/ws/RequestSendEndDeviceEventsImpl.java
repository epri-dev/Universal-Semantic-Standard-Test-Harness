package com.sixthc.server.ws;

import javax.xml.ws.Holder;

import org.apache.log4j.Logger;

import ch.iec.tc57._2011.enddeviceevents.FaultMessage;
import ch.iec.tc57._2011.enddeviceevents.SendEndDeviceEventsPort;
import ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsPayloadType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;

import com.sixthc.client.SendEndDeviceEventsClient;

public class RequestSendEndDeviceEventsImpl implements SendEndDeviceEventsPort {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(RequestSendEndDeviceEventsImpl.class);

	SendEndDeviceEventsClient client;

	public SendEndDeviceEventsClient getClient() {
		return client;
	}

	public void setClient(SendEndDeviceEventsClient client) {
		this.client = client;
	}

	@Override
	public void canceledEndDeviceEvents(Holder<HeaderType> header,
			Holder<EndDeviceEventsPayloadType> payload, Holder<ReplyType> reply)
			throws FaultMessage {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletedEndDeviceEvents(Holder<HeaderType> header,
			Holder<EndDeviceEventsPayloadType> payload, Holder<ReplyType> reply)
			throws FaultMessage {
		// TODO Auto-generated method stub

	}

	@Override
	public void changedEndDeviceEvents(Holder<HeaderType> header,
			Holder<EndDeviceEventsPayloadType> payload, Holder<ReplyType> reply)
			throws FaultMessage {
		// TODO Auto-generated method stub

	}

	@Override
	public void createdEndDeviceEvents(Holder<HeaderType> header,
			Holder<EndDeviceEventsPayloadType> payload, Holder<ReplyType> reply)
			throws FaultMessage {
		client.setHeader(header.value);
		client.setPayload(payload.value);
		client.create();

		reply.value = new ReplyType();
		reply.value.setResult("OK");

	}

	@Override
	public void closedEndDeviceEvents(Holder<HeaderType> header,
			Holder<EndDeviceEventsPayloadType> payload, Holder<ReplyType> reply)
			throws FaultMessage {
		// TODO Auto-generated method stub

	}

}
