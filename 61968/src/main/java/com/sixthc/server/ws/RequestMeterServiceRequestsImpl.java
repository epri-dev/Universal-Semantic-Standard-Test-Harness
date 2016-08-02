package com.sixthc.server.ws;

import javax.xml.ws.Holder;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import ch.iec.tc57._2011.meterservicerequests.FaultMessage;
import ch.iec.tc57._2011.meterservicerequests.RequestMeterServiceRequestsPort;
import ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType;
import ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsRequestMessageType;
import ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsResponseMessageType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;
import ch.iec.tc57._2011.schema.message.RequestType;

import com.sixthc.client.ReplyMeterServiceRequestsClient;

@Component
public class RequestMeterServiceRequestsImpl implements
		RequestMeterServiceRequestsPort {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(RequestMeterServiceRequestsImpl.class);
	
	private ReplyMeterServiceRequestsClient client;

	public ReplyMeterServiceRequestsClient getClient() {
		return client;
	}

	public void setClient(ReplyMeterServiceRequestsClient client) {
		this.client = client;
	}



	@Override
	public void createMeterServiceRequests(Holder<HeaderType> header,
			RequestType request,
			Holder<MeterServiceRequestsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {

		log.debug("createMeterServiceRequests called");

		client.setHeader(header.value);
		client.setPayload(payload.value);
		client.create();


		reply.value = new ReplyType();
		reply.value.setResult("OK");		
	}



	@Override
	public void deleteMeterServiceRequests(Holder<HeaderType> header,
			RequestType request,
			Holder<MeterServiceRequestsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void changeMeterServiceRequests(Holder<HeaderType> header,
			RequestType request,
			Holder<MeterServiceRequestsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {

		client.setHeader(header.value);
		client.setPayload(payload.value);
		client.change();

		reply.value = new ReplyType();
		reply.value.setResult("OK");
		
	}



	@Override
	public void cancelMeterServiceRequests(Holder<HeaderType> header,
			RequestType request,
			Holder<MeterServiceRequestsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void closeMeterServiceRequests(Holder<HeaderType> header,
			RequestType request,
			Holder<MeterServiceRequestsPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub
		
	}
	
	

}
