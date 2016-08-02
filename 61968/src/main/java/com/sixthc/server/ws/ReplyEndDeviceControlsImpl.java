package com.sixthc.server.ws;

import javax.xml.ws.Holder;

import org.apache.log4j.Logger;

import ch.iec.tc57._2011.enddevicecontrols.FaultMessage;
import ch.iec.tc57._2011.enddevicecontrols.ReplyEndDeviceControlsPort;
import ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType;
import ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsResponseMessageType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;

public class ReplyEndDeviceControlsImpl implements ReplyEndDeviceControlsPort {
	private static org.apache.log4j.Logger log = Logger
	.getLogger(ReplyEndDeviceControlsImpl.class);


	@Override
	public void closedEndDeviceControls(Holder<HeaderType> header,
			Holder<EndDeviceControlsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub

	}

	@Override
	public void canceledEndDeviceControls(Holder<HeaderType> header,
			Holder<EndDeviceControlsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub

	}

	@Override
	public void createdEndDeviceControls(Holder<HeaderType> header,
			Holder<EndDeviceControlsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {

		EndDeviceControlsResponseMessageType response = new EndDeviceControlsResponseMessageType();
		reply.value = new ReplyType();
		reply.value.setResult("OK");
	}

	@Override
	public void deletedEndDeviceControls(Holder<HeaderType> header,
			Holder<EndDeviceControlsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub

	}

	@Override
	public void changedEndDeviceControls(Holder<HeaderType> header,
			Holder<EndDeviceControlsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub

	}

}
