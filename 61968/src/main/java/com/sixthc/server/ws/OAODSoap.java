package com.sixthc.server.ws;

import java.util.List;

import org.apache.log4j.Logger;
import org.multispeak.version_3.ArrayOfCircuitElement;
import org.multispeak.version_3.ArrayOfDomainMember;
import org.multispeak.version_3.ArrayOfErrorObject;
import org.multispeak.version_3.ArrayOfMeterConnectivity;
import org.multispeak.version_3.ArrayOfOutageDetectionDevice;
import org.multispeak.version_3.ArrayOfOutageDetectionEvent;
import org.multispeak.version_3.ArrayOfString;
import org.multispeak.version_3.ErrorObject;
import org.multispeak.version_3.OutageDetectionEvent;
import org.multispeak.version_3.OutageEventStatus;
import org.multispeak.version_3.OutageLocation;

public class OAODSoap implements org.multispeak.version_3_0.OAODSoap {
	private static org.apache.log4j.Logger log = Logger
	.getLogger(OAODSoap.class);
	
	@Override
	public ArrayOfString getActiveOutages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfCircuitElement getAllCircuitElements(String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfCircuitElement getUplineCircuitElements(String eaLoc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OutageEventStatus getOutageEventStatus(String outageEventID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfMeterConnectivity getSiblingMeterConnectivity(String meterNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfCircuitElement getChildCircuitElements(String eaLoc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfString getMethods() {
		log.info("getMethods called");
		ArrayOfString aos = new ArrayOfString();
		List<String> methods = aos.getString();
		methods.add("getMethods");
		methods.add("pingURL");
		methods.add("odEventNotification");
		return aos;
	}

	@Override
	public ArrayOfString getSubstationNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfCircuitElement getDownlineCircuitElements(String eaLoc,
			String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfCircuitElement getModifiedCircuitElements(
			String previousSessionID, String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfMeterConnectivity getDownlineMeterConnectivity(String meterNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfCircuitElement getParentCircuitElements(String eaLoc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject odDeviceChangedNotification(
			ArrayOfOutageDetectionDevice odDevices) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfMeterConnectivity getUplineMeterConnectivity(String meterNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OutageEventStatus getOutageEventStatusByOutageLocation(
			OutageLocation location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfDomainMember getDomainMembers(String domainName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject odEventNotification(
			ArrayOfOutageDetectionEvent odEvents) {
		log.info("odEventNotification called");

		ArrayOfErrorObject errors = new ArrayOfErrorObject();
		return errors;
	}

	@Override
	public ArrayOfErrorObject pingURL() {
		log.info("ping called");
		return new ArrayOfErrorObject();
	}

	@Override
	public ArrayOfString getDomainNames() {
		// TODO Auto-generated method stub
		return null;
	}

}
