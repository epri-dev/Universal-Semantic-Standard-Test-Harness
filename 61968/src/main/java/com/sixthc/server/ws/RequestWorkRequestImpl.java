package com.sixthc.server.ws;

import javax.xml.ws.Holder;

import ch.iec.tc57._2010.schema.message.HeaderType;
import ch.iec.tc57._2010.schema.message.ReplyType;
import ch.iec.tc57._2010.schema.message.RequestType;
import ch.iec.tc57._2010.workrequest.FaultMessage;
import ch.iec.tc57._2010.workrequest.WorkRequestPort;
import ch.iec.tc57._2010.workrequestmessage.WorkRequestPayloadType;

import com.sixthc.client.SendMeterServiceRequestsClient;
import com.sixthc.client.WorkRequestClient;

public class RequestWorkRequestImpl implements WorkRequestPort {

	private WorkRequestClient client;

	public WorkRequestClient getClient() {
		return client;
	}

	public void setClient(WorkRequestClient client) {
		this.client = client;
	}

	@Override
	public void deleteWorkRequest(Holder<HeaderType> header,
			RequestType request, Holder<WorkRequestPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancelWorkRequest(Holder<HeaderType> header,
			RequestType request, Holder<WorkRequestPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeWorkRequest(Holder<HeaderType> header,
			RequestType request, Holder<WorkRequestPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeWorkRequest(Holder<HeaderType> header,
			RequestType request, Holder<WorkRequestPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub

	}

	@Override
	public void createWorkRequest(Holder<HeaderType> header,
			RequestType request, Holder<WorkRequestPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {

		client.setHeader(header.value);
		client.setPayload(payload.value);
		client.create();

		reply.value = new ReplyType();
		reply.value.setResult("OK");		
	}

}
