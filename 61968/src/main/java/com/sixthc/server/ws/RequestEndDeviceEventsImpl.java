package com.sixthc.server.ws;

import javax.xml.ws.Holder;

import org.apache.log4j.Logger;

import ch.iec.tc57._2011.enddeviceevents.FaultMessage;
import ch.iec.tc57._2011.enddeviceevents.RequestEndDeviceEventsPort;
import ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsPayloadType;
import ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsRequestMessageType;
import ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsResponseMessageType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;
import ch.iec.tc57._2011.schema.message.RequestType;

import com.sixthc.client.ReplyEndDeviceEventsClient;

public class RequestEndDeviceEventsImpl implements
		RequestEndDeviceEventsPort {
	private static org.apache.log4j.Logger log = Logger
	.getLogger(RequestEndDeviceEventsImpl.class);
	
	private ReplyEndDeviceEventsClient client;


	public ReplyEndDeviceEventsClient getClient() {
		return client;
	}

	public void setClient(ReplyEndDeviceEventsClient client) {
		this.client = client;
	}



	@Override
	public void cancelEndDeviceEvents(Holder<HeaderType> header,
			RequestType request, Holder<EndDeviceEventsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void createEndDeviceEvents(Holder<HeaderType> header,
			RequestType request, Holder<EndDeviceEventsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {

		log.debug("createEndDeviceEvents called");

		client.setHeader(header.value);
		client.setPayload(payload.value);
		client.create();

		reply.value = new ReplyType();
		reply.value.setResult("OK");		
	}



	@Override
	public void closeEndDeviceEvents(Holder<HeaderType> header,
			RequestType request, Holder<EndDeviceEventsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void changeEndDeviceEvents(Holder<HeaderType> header,
			RequestType request, Holder<EndDeviceEventsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deleteEndDeviceEvents(Holder<HeaderType> header,
			RequestType request, Holder<EndDeviceEventsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub
		
	}
	
	

}
