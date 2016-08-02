package com.sixthc.server.ws;

import org.apache.log4j.Logger;

import ch.iec.tc57._2011.meterreadings.FaultMessage;
import ch.iec.tc57._2011.meterreadings.GetMeterReadingsPort;
import ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsRequestMessageType;
import ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsResponseMessageType;

import com.sixthc.client.GetMeterReadingsClient;

public class RequestGetMeterReadingsImpl implements GetMeterReadingsPort {
	private static org.apache.log4j.Logger log = Logger
	.getLogger(RequestMeterReadingsImpl.class);
	private GetMeterReadingsClient client;
	
	public GetMeterReadingsClient getClient() {
		return client;
	}

	public void setClient(GetMeterReadingsClient client) {
		this.client = client;
	}

	@Override
	public MeterReadingsResponseMessageType getMeterReadings(
			MeterReadingsRequestMessageType msg)
			throws FaultMessage {
		log.info("getMeterReadings called");
		client.setHeader(msg.getHeader());
		client.setPayload(msg.getPayload());
		return client.get();
	}

}
