package com.sixthc.server.ws;

import javax.xml.ws.Holder;

import org.apache.log4j.Logger;

import ch.iec.tc57._2011.enddevicecontrols.FaultMessage;
import ch.iec.tc57._2011.enddevicecontrols.RequestEndDeviceControlsPort;
import ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;
import ch.iec.tc57._2011.schema.message.RequestType;

import com.sixthc.client.ReplyEndDeviceControlsClient;

public class RequestEndDeviceControlsImpl implements
		RequestEndDeviceControlsPort {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(RequestEndDeviceControlsImpl.class);

	private ReplyEndDeviceControlsClient client;

	public ReplyEndDeviceControlsClient getClient() {
		return client;
	}

	public void setClient(ReplyEndDeviceControlsClient client) {
		this.client = client;
	}

	@Override
	public void closeEndDeviceControls(Holder<HeaderType> header,
			RequestType request, Holder<EndDeviceControlsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancelEndDeviceControls(Holder<HeaderType> header,
			RequestType request, Holder<EndDeviceControlsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub

	}

	@Override
	public void createEndDeviceControls(Holder<HeaderType> header,
			RequestType request, Holder<EndDeviceControlsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {

		client.setHeader(header.value);
		client.setPayload(payload.value);
		client.create();

		// TODO : The request implementations should get reply from client and return that
		reply.value = new ReplyType();
		reply.value.setResult("OK");
	}

	@Override
	public void changeEndDeviceControls(Holder<HeaderType> header,
			RequestType request, Holder<EndDeviceControlsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEndDeviceControls(Holder<HeaderType> header,
			RequestType request, Holder<EndDeviceControlsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub

	}

}
