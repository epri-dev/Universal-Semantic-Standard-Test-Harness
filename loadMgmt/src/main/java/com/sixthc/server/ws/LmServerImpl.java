package com.sixthc.server.ws;

import org.apache.log4j.Logger;
import org.multispeak.version_3.ArrayOfCustomer;
import org.multispeak.version_3.ArrayOfDomainMember;
import org.multispeak.version_3.ArrayOfDomainNameChange;
import org.multispeak.version_3.ArrayOfErrorObject;
import org.multispeak.version_3.ArrayOfLMDeviceExchange;
import org.multispeak.version_3.ArrayOfLoadManagementDevice;
import org.multispeak.version_3.ArrayOfLoadManagementEvent;
import org.multispeak.version_3.ArrayOfMeter;
import org.multispeak.version_3.ArrayOfScadaAnalog;
import org.multispeak.version_3.ArrayOfScadaPoint1;
import org.multispeak.version_3.ArrayOfScadaStatus;
import org.multispeak.version_3.ArrayOfServiceLocation;
import org.multispeak.version_3.ArrayOfString;
import org.multispeak.version_3.ArrayOfSubstationLoadControlStatus;
import org.multispeak.version_3.ErrorObject;
import org.multispeak.version_3.InitiateRequest;
import org.multispeak.version_3.LoadManagementEvent;
import org.multispeak.version_3.PowerFactorManagementEvent;
import org.multispeak.version_3.RegistrationInfo;
import org.multispeak.version_3.ScadaAnalog;
import org.multispeak.version_3.ScadaStatus;
import org.multispeak.version_3_0.LMServerSoap;

import com.sixthc.client.RequestLMClient;

public class LmServerImpl implements LMServerSoap {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(LmServerImpl.class);

	private RequestLMClient client;

	public RequestLMClient getClient() {
		return client;
	}

	public void setClient(RequestLMClient client) {
		this.client = client;
	}

	@Override
	public ArrayOfErrorObject lmDeviceRemoveNotification(
			ArrayOfLoadManagementDevice removedLMDs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void scadaStatusChangedNotificationByPointID(ScadaStatus scadaStatus) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayOfLoadManagementDevice getLoadManagementDeviceByMeterNumber(
			String meterNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject unregisterForService(String registrationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String requestRegistrationID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject scadaPointChangedNotificationForAnalog(
			ArrayOfScadaPoint1 scadaPoints) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ErrorObject initiateLoadManagementEvent(
			LoadManagementEvent theLMEvent) {

		ErrorObject eo = new ErrorObject();
		return eo;
	}

	@Override
	public ErrorObject initiatePowerFactorManagementEvent(
			PowerFactorManagementEvent thePFMEvent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfString getMethods() {
		log.info("getMethods called");
		ArrayOfString aos = new ArrayOfString();
		aos.getString().add("pingURL");
		aos.getString().add("initiateLoadManagementEvent");
		aos.getString().add("getMethods");
		return aos;
	}

	@Override
	public ArrayOfErrorObject scadaAnalogChangedNotificationForVoltage(
			ArrayOfScadaAnalog scadaAnalogs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject scadaAnalogChangedNotificationForPower(
			ArrayOfScadaAnalog scadaAnalogs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfSubstationLoadControlStatus getAllSubstationLoadControlStatuses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject lmDeviceExchangeNotification(
			ArrayOfLMDeviceExchange lmdChangeout) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getAmountOfControlledLoad() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isLoadManagementActive(String servLoc) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayOfErrorObject scadaPointChangedNotificationForStatus(
			ArrayOfScadaPoint1 scadaPoints) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject registerForService(
			RegistrationInfo registrationDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject initiateLoadManagementEvents(
			ArrayOfLoadManagementEvent theLMEvents) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfLoadManagementDevice getLoadManagementDeviceByServLoc(
			String servLoc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject scadaStatusChangedNotification(
			ArrayOfScadaStatus scadaStatuses) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject scadaAnalogChangedNotification(
			ArrayOfScadaAnalog scadaAnalogs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfString getPublishMethods() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject domainMembersChangedNotification(
			ArrayOfDomainMember changedDomainMembers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject customerChangedNotification(
			ArrayOfCustomer changedCustomers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject lmDeviceAddNotification(
			ArrayOfLoadManagementDevice addedLMDs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject domainNamesChangedNotification(
			ArrayOfDomainNameChange changedDomainNames) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getAmountOfControllableLoad() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayOfErrorObject scadaPointChangedNotification(
			ArrayOfScadaPoint1 scadaPoints) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfDomainMember getDomainMembers(String domainName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject meterChangedNotification(
			ArrayOfMeter changedMeters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfLoadManagementDevice getAllLoadManagementDevices(
			String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject lmDeviceChangedNotification(
			ArrayOfLoadManagementDevice changedLMDs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject lmDeviceRetireNotification(
			ArrayOfLoadManagementDevice retiredLMDs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject pingURL() {
		log.info("PingURL called");
		return null;
/*		ArrayOfErrorObject aoe = new ArrayOfErrorObject();
		ErrorObject eo = new ErrorObject();
		return aoe; */
	}

	@Override
	public RegistrationInfo getRegistrationInfoByID(String registrationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void scadaAnalogChangedNotificationByPointID(ScadaAnalog scadaAnalog) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayOfErrorObject serviceLocationChangedNotification(
			ArrayOfServiceLocation changedServiceLocations) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfString getDomainNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ErrorObject requestLoadManagementEvent(InitiateRequest theLMEvent) {
		log.info("requestLoadManagement received");

		return client.execute(theLMEvent);

	}
}
