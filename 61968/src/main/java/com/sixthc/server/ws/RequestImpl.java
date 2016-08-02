package com.sixthc.server.ws;

import java.util.Map;

import org.apache.log4j.Logger;

import ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsEventMessageType;
import ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsEventMessageType;
import ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsEventMessageType;
import ch.iec.tc57._2011.meterservicerequests.ReplyMeterServiceRequests;
import ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsEventMessageType;
import ch.iec.tc57._2011.schema.message.ReplyType;

import com.sixthc.client.ReplyEndDeviceControlsClient;
import com.sixthc.client.ReplyEndDeviceEventsClient;
import com.sixthc.client.ReplyMeterReadingsClient;
import com.sixthc.client.ReplyMeterServiceRequestsClient;
import com.sixthc.client.RequestClient;
import com.sixthc.client.SendMeterReadingsClient;
import com.sixthc.client.SendMeterServiceRequestsClient;
import com.sixthc.client.ServiceType;
import com.sixthc.request.EndDeviceControlsPayload;
import com.sixthc.request.EndDeviceEventsPayload;
import com.sixthc.request.FaultMessage;
import com.sixthc.request.MeterReadSchedulePayload;
import com.sixthc.request.MeterReadingsPayload;
import com.sixthc.request.MeterServiceRequestsPayload;
import com.sixthc.request.RequestPort;

public class RequestImpl implements RequestPort {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(RequestImpl.class);

	private Map<String, RequestClient> clients;

	@Override
	public ReplyType requestEndDeviceControls(
			EndDeviceControlsPayload endDevicePayload) throws FaultMessage {

		ReplyType response = new ReplyType();

		ServiceType service = ServiceType
				.valueOf(endDevicePayload.getService());
		switch (service) {
		case REPLY:
			ReplyEndDeviceControlsClient reply = new ReplyEndDeviceControlsClient();
			EndDeviceControlsEventMessageType payload = endDevicePayload
					.getPayload();
			reply.setHeader(payload.getHeader());
			reply.setPayload(payload.getPayload());
			try {
				reply.execute(endDevicePayload.getCommand());
				response.setResult("SUCCESS");
			} catch (ch.iec.tc57._2011.enddevicecontrols.FaultMessage e) {
				log.error(e);
				response.setResult("FAILED");
			}
			break;
		}

		return response;
	}

	@Override
	public ReplyType requestEndDeviceEvents(
			EndDeviceEventsPayload endDeviceEventsPayload) throws FaultMessage {

		ReplyType response = new ReplyType();

		ServiceType service = ServiceType.valueOf(endDeviceEventsPayload
				.getService());
		switch (service) {
		case REPLY:
			ReplyEndDeviceEventsClient reply = new ReplyEndDeviceEventsClient();
			EndDeviceEventsEventMessageType payload = endDeviceEventsPayload
					.getPayload();

			try {
				reply.setHeader(payload.getHeader());
				reply.setPayload(payload.getPayload());
				reply.execute(endDeviceEventsPayload.getCommand());
				response.setResult("SUCCESS");
			} catch (ch.iec.tc57._2011.enddeviceevents.FaultMessage e) {
				log.error(e);
				response.setResult("FAILED");
			}
		}
		return response;
	}

	@Override
	public ReplyType requestMeterServiceRequests(
			MeterServiceRequestsPayload meterServiceRequestsPayload)
			throws FaultMessage {

		MeterServiceRequestsEventMessageType payload;
		ReplyType response = new ReplyType();

		ServiceType service = ServiceType.valueOf(meterServiceRequestsPayload
				.getService());
		switch (service) {
		case REPLY:
			RequestClient reply = clients.get("md_cis-2");
			payload = meterServiceRequestsPayload.getPayload();
			response = reply.execute(meterServiceRequestsPayload);
		case SEND:
			SendMeterServiceRequestsClient send = new SendMeterServiceRequestsClient();
			payload = meterServiceRequestsPayload.getPayload();

			try {
				send.setHeader(payload.getHeader());
				send.setPayload(payload.getPayload());
				response.setResult("SUCCESS");
				send.execute(meterServiceRequestsPayload.getCommand());
			} catch (ch.iec.tc57._2011.meterservicerequests.FaultMessage e) {
				log.error(e);
				response.setResult("FAILED");
			}
		}

		return response;
	}

	@Override
	public ReplyType requestMeterReadings(
			MeterReadingsPayload meterReadingsPayload) throws FaultMessage {
		MeterReadingsEventMessageType payload;
		ReplyType response = new ReplyType();

		ServiceType service = ServiceType.valueOf(meterReadingsPayload
				.getService());
		switch (service) {
		case REPLY:
			ReplyMeterReadingsClient reply = new ReplyMeterReadingsClient();
			payload = meterReadingsPayload.getPayload();

			try {
				reply.setHeader(payload.getHeader());
				reply.setPayload(payload.getPayload());
				response.setResult("SUCCESS");
				reply.execute(meterReadingsPayload.getCommand());
			} catch (ch.iec.tc57._2011.meterreadings.FaultMessage e) {
				log.error(e);
				response.setResult("FAILED");
			}
			break;
		case SEND:
			SendMeterReadingsClient Send = new SendMeterReadingsClient();
			payload = meterReadingsPayload.getPayload();

			try {
				Send.setHeader(payload.getHeader());
				Send.setPayload(payload.getPayload());
				response.setResult("SUCCESS");
				Send.execute(meterReadingsPayload.getCommand());
			} catch (ch.iec.tc57._2011.meterreadings.FaultMessage e) {
				log.error(e);
				response.setResult("FAILED");
			}
			break;
		}

		return response;
	}

	@Override
	public ReplyType requestMeterReadSchedule(
			MeterReadSchedulePayload meterReadSchedulePayload)
			throws FaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, RequestClient> getClients() {
		return clients;
	}

	public void setClients(Map<String, RequestClient> clients) {
		this.clients = clients;
	}

}
