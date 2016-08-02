package com.sixthc.server.ws;

import java.util.logging.Logger;

import javax.xml.ws.Holder;

import org.apache.cxf.common.logging.LogUtils;

import ch.iec.tc57._2011.enddevicecontrols.FaultMessage;
import ch.iec.tc57._2011.enddevicecontrols.SendEndDeviceControlsPort;
import ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;

public class SendEndDeviceControlsImpl implements SendEndDeviceControlsPort {
	private static final Logger log = LogUtils
	.getLogger(SendEndDeviceControlsImpl.class);

	@Override
	public void closedEndDeviceControls(Holder<HeaderType> header,
			Holder<EndDeviceControlsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {

		reply.value = new ReplyType();
		reply.value.setResult("OK");
		
	}

	@Override
	public void canceledEndDeviceControls(Holder<HeaderType> header,
			Holder<EndDeviceControlsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {

		reply.value = new ReplyType();
		reply.value.setResult("OK");		
	}

	@Override
	public void createdEndDeviceControls(Holder<HeaderType> header,
			Holder<EndDeviceControlsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {

		reply.value = new ReplyType();
		reply.value.setResult("OK");		
	}

	@Override
	public void deletedEndDeviceControls(Holder<HeaderType> header,
			Holder<EndDeviceControlsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {

		reply.value = new ReplyType();
		reply.value.setResult("OK");		
	}

	@Override
	public void changedEndDeviceControls(Holder<HeaderType> header,
			Holder<EndDeviceControlsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {


		reply.value = new ReplyType();
		reply.value.setResult("OK");
	}





}
