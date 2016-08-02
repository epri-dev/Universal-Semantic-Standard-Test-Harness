package com.sixthc.server.ws;

import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.xml.ws.Holder;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import org.apache.cxf.common.logging.LogUtils;
import org.apache.cxf.jaxws.context.WrappedMessageContext;
import org.apache.cxf.message.Message;

import com.sixthc.interceptor.LoggingOutInterceptor;

import ch.iec.tc57._2011.meterservicerequests.FaultMessage;
import ch.iec.tc57._2011.meterservicerequests.SendMeterServiceRequestsPort;
import ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsEventMessageType;
import ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType;
import ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsResponseMessageType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;

public class SendMeterServiceRequestsImpl implements
		SendMeterServiceRequestsPort {
	private static final Logger log = LogUtils
			.getLogger(SendMeterServiceRequestsImpl.class);




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

		MeterServiceRequestsResponseMessageType response = new MeterServiceRequestsResponseMessageType();
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
