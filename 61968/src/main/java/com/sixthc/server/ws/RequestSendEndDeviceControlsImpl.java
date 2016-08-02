package com.sixthc.server.ws;

import java.util.logging.Logger;

import javax.xml.ws.Holder;

import org.apache.cxf.common.logging.LogUtils;

import ch.iec.tc57._2011.enddevicecontrols.FaultMessage;
import ch.iec.tc57._2011.enddevicecontrols.SendEndDeviceControlsPort;
import ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsPayloadType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;

import com.sixthc.client.SendEndDeviceControlsClient;

public class RequestSendEndDeviceControlsImpl implements SendEndDeviceControlsPort {
	private static final Logger log = LogUtils
	.getLogger(RequestSendEndDeviceControlsImpl.class);

   private SendEndDeviceControlsClient client;



   public void setClient(SendEndDeviceControlsClient client) {
      this.client = client;
   }

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
		// TODO Auto-generated method stub
         client.setHeader(header.value);
         client.setPayload(payload.value);
         client.create();

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
