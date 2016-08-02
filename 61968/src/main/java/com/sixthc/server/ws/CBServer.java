package com.sixthc.server.ws;

import java.util.Iterator;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.multispeak.version_4.Account;
import org.multispeak.version_4.ArrayOfAccount1;
import org.multispeak.version_4.ArrayOfAssignment;
import org.multispeak.version_4.ArrayOfBillingAccountLoad;
import org.multispeak.version_4.ArrayOfBillingData;
import org.multispeak.version_4.ArrayOfBillingDetail;
import org.multispeak.version_4.ArrayOfCDDevice1;
import org.multispeak.version_4.ArrayOfCDDeviceExchange;
import org.multispeak.version_4.ArrayOfCDState;
import org.multispeak.version_4.ArrayOfCDStateChange;
import org.multispeak.version_4.ArrayOfChargeableDevice;
import org.multispeak.version_4.ArrayOfConnectDisconnectEvent;
import org.multispeak.version_4.ArrayOfCustomer;
import org.multispeak.version_4.ArrayOfDomainMember;
import org.multispeak.version_4.ArrayOfDomainNameChange;
import org.multispeak.version_4.ArrayOfElectricMeter1;
import org.multispeak.version_4.ArrayOfErrorObject;
import org.multispeak.version_4.ArrayOfGasMeter1;
import org.multispeak.version_4.ArrayOfHistoryComment;
import org.multispeak.version_4.ArrayOfHistoryLog;
import org.multispeak.version_4.ArrayOfInHomeDisplay1;
import org.multispeak.version_4.ArrayOfInHomeDisplayExchange;
import org.multispeak.version_4.ArrayOfLMDeviceExchange;
import org.multispeak.version_4.ArrayOfLoadManagementDevice1;
import org.multispeak.version_4.ArrayOfMeterBase;
import org.multispeak.version_4.ArrayOfMeterBaseExchange;
import org.multispeak.version_4.ArrayOfMeterConnectivity;
import org.multispeak.version_4.ArrayOfMeterHistoryEvent;
import org.multispeak.version_4.ArrayOfMeterID1;
import org.multispeak.version_4.ArrayOfMeterReading1;
import org.multispeak.version_4.ArrayOfOtherMeter;
import org.multispeak.version_4.ArrayOfPaymentTransactionList;
import org.multispeak.version_4.ArrayOfPole;
import org.multispeak.version_4.ArrayOfPpmBalanceAdjustment;
import org.multispeak.version_4.ArrayOfProfileObject;
import org.multispeak.version_4.ArrayOfPropaneMeter1;
import org.multispeak.version_4.ArrayOfReadingScheduleResult;
import org.multispeak.version_4.ArrayOfSecurityLight1;
import org.multispeak.version_4.ArrayOfServiceLocation1;
import org.multispeak.version_4.ArrayOfServiceOrder1;
import org.multispeak.version_4.ArrayOfStreetLight;
import org.multispeak.version_4.ArrayOfString18;
import org.multispeak.version_4.ArrayOfSwitchingOrder;
import org.multispeak.version_4.ArrayOfTestedElectricMeter;
import org.multispeak.version_4.ArrayOfTransformerBank;
import org.multispeak.version_4.ArrayOfUsage;
import org.multispeak.version_4.ArrayOfWaterMeter1;
import org.multispeak.version_4.ArrayOfWorkRequest;
import org.multispeak.version_4.ArrayOfWorkTask1;
import org.multispeak.version_4.BilledUsage;
import org.multispeak.version_4.CDState;
import org.multispeak.version_4.CDStateChange;
import org.multispeak.version_4.ConvenienceFeeList;
import org.multispeak.version_4.CreditCardPayment;
import org.multispeak.version_4.Customer;
import org.multispeak.version_4.ElectricMeters;
import org.multispeak.version_4.EndDeviceShipment;
import org.multispeak.version_4.ErrorObject;
import org.multispeak.version_4.ExtensionsList;
import org.multispeak.version_4.FormattedBlock;
import org.multispeak.version_4.GasMeters;
import org.multispeak.version_4.InHomeDisplayGroup;
import org.multispeak.version_4.IntervalData;
import org.multispeak.version_4.MeterBase;
import org.multispeak.version_4.MeterEventList;
import org.multispeak.version_4.MeterExchanges;
import org.multispeak.version_4.MeterGroups;
import org.multispeak.version_4.MeterID;
import org.multispeak.version_4.Meters;
import org.multispeak.version_4.ObjectRef;
import org.multispeak.version_4.PayableItemList;
import org.multispeak.version_4.PaymentExtensionList;
import org.multispeak.version_4.PaymentTransaction;
import org.multispeak.version_4.PaymentTransactionList;
import org.multispeak.version_4.PhaseCode;
import org.multispeak.version_4.Pole;
import org.multispeak.version_4.PpmLocation;
import org.multispeak.version_4.Project;
import org.multispeak.version_4.PropaneMeters;
import org.multispeak.version_4.RegistrationInfo;
import org.multispeak.version_4.RequestedNumber;
import org.multispeak.version_4.ResponseCode;
import org.multispeak.version_4.ServiceType;
import org.multispeak.version_4.SoStatusCode;
import org.multispeak.version_4.TelephoneNumber;
import org.multispeak.version_4.Tender;
import org.multispeak.version_4.TransformerBank;
import org.multispeak.version_4.Usage;
import org.multispeak.version_4.WaterMeters;
import org.multispeak.version_4_1_release.CBServerSoap;

public class CBServer implements CBServerSoap {

	@Override
	public ArrayOfServiceLocation1 getServiceLocationByLoadGroup(
			String loadGroup, String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project getProject(ObjectRef projectID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Meters getMetersByEALocation(String eaLoc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfString18 getIHDGroupNamesByInHomeDisplayID(
			String inHomeDisplayID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfServiceOrder1 getServiceOrderByServiceOrderID(
			String serviceLocationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject meterInstalledNotification(Meters addedMeters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfString18 getPublishMethods() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfTransformerBank getModifiedTransformerBanksFromCB(
			String previousSessionID, String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject taskListNotification(ArrayOfWorkTask1 tasks,
			String transactionID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfServiceOrder1 getServiceOrdersByStatus(SoStatusCode status,
			String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfServiceLocation1 getServiceLocationByServiceType(
			ServiceType serviceType, String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfConnectDisconnectEvent getAllConnectDisconnectEventsByReasonCode(
			String reasonCode, XMLGregorianCalendar startDate,
			XMLGregorianCalendar endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MeterGroups getMeterGroupMembers(String meterGroupName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransformerBank getTransformerBankByBankIDFromCB(String bankID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfChargeableDevice getChargeableDevicesByAccountNumber(
			String accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PpmLocation getPPMCustomer(String accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Meters getMetersByAccountNumberAndServiceType(String accountNumber,
			ServiceType serviceType, String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject readingChangedNotification(
			ArrayOfMeterReading1 changedMeterReads, String transactionID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfUsage getUsageByAccountNumber(String accountNumber,
			ServiceType serviceType) {
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
	public ArrayOfErrorObject extendPayment(PaymentExtensionList extensionList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Meters getMeterByServiceLocationID(String serviceLocationID,
			ServiceType serviceType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfString18 getMethods() {
		ArrayOfString18 methods = new ArrayOfString18();
		List<String> list = methods.getString();
		list.add("getMethods");
		list.add("pingURL");
		return methods;
	}

	@Override
	public Usage getUsageByMeterID(MeterID meterID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfPaymentTransactionList getPPMPayments(
			XMLGregorianCalendar startTime, XMLGregorianCalendar stopTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject cdStatesNotification(ArrayOfCDState states,
			String transactionID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject cdStatesChangedNotification(
			ArrayOfCDStateChange stateChanges, String transactionID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject modifyCBDataForTransformerBank(
			ArrayOfTransformerBank xfmrBankData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfString18 getMeterGroupNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject switchingOrderChangedNotification(
			ArrayOfSwitchingOrder switchingOrders) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject initiateWorkRequest(ArrayOfWorkRequest requests,
			String transactionID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfPole getModifiedPolesFromCB(String previousSessionID,
			String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfServiceLocation1 getServiceLocationByAccountNumber(
			String accountNumber, ServiceType serviceType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Meters getAllMetersByServiceType(ServiceType serviceType,
			String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfBillingData getBillingData(
			XMLGregorianCalendar startBillDate, XMLGregorianCalendar endBillDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfServiceLocation1 getServiceLocationByServiceStatus(
			String servStatus, String lastReceived, ServiceType serviceType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfElectricMeter1 getAllElectricMeters(String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentExtensionList requestPaymentExtension(
			PaymentExtensionList extensionList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfSecurityLight1 getAllSecurityLights(String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject modifyCBDataForSecurityLight(
			ArrayOfSecurityLight1 securityLightData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Meters getMetersByFacilityID(String facilityID,
			ServiceType serviceType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject modifyCBDataForUsage(ArrayOfUsage usageData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfMeterHistoryEvent getMeterHistoryByMeterID(MeterID meter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentTransactionList processPaymentTransaction(
			PaymentTransactionList transactions) {
		PaymentTransactionList returnList = new PaymentTransactionList();
		for (PaymentTransaction transaction : transactions
				.getPaymentTransaction()) {
			for (CreditCardPayment p : transaction.getCreditCardPayment()) {
				if (p.getTender() == null)
					p.setTender(new Tender());
				p.getTender().setResponseCode(ResponseCode.SUCCESS);
			}
			returnList.getPaymentTransaction().add(transaction);
		}
		return returnList;
	}

	@Override
	public ArrayOfErrorObject serviceLocationNetworkChangedNotification(
			ArrayOfServiceLocation1 changedServiceLocations) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfUsage getUsageByServiceLocationID(String serviceLocationID,
			ServiceType serviceType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfPole getAllPolesFromCB(String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfGasMeter1 getAllGasMeters(String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject returnGeneratedNumber(RequestedNumber requestedNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject meterBaseExchangeNotification(
			ArrayOfMeterBaseExchange mbChangeout) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfCustomer getAllCustomers(String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfString18 getServiceLocationIDByHomePhone(
			TelephoneNumber phone, ServiceType serviceType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfCustomer getModifiedCustomers(String previousSessionID,
			String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Meters getMetersByAMRType(String amrVendor, String amrDeviceType,
			String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RequestedNumber getNextNumber(ExtensionsList extensions,
			String numberType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfTransformerBank getAllTransformerBanksFromCB(
			String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfString18 getIHDGroupNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject meterBaseInstalledNotification(
			ArrayOfMeterBase addedMBs) {
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
	public ArrayOfServiceLocation1 getModifiedServiceLocations(
			String previousSessionID, String lastReceived,
			ServiceType serviceType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfPropaneMeter1 getAllPropaneMeters(String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfOtherMeter getAllOtherMeters(String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Meters getMeterByCustomerID(String customerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfWaterMeter1 getAllWaterMeters(String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject poleChangedNotification(ArrayOfPole changedPoles) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PropaneMeters getPropaneMetersByAccountNumber(String accountNumber,
			String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerByHomePhone(TelephoneNumber phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject inHomeDisplayInstalledNotification(
			ArrayOfInHomeDisplay1 addedIHDs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject meterEventNotification(MeterEventList events) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject meterExchangeNotification(
			MeterExchanges meterChangeout) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject endDeviceShipmentNotification(
			EndDeviceShipment shipment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject lmDeviceInstalledNotification(
			ArrayOfLoadManagementDevice1 installedLMDs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject formattedBlockNotification(
			FormattedBlock changedMeterReads, String transactionID,
			String errorString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account getAccountByServiceLocationIDAndServiceType(
			String serviceLocationID, ServiceType serviceType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject modifyCBDataForStreetLight(
			ArrayOfStreetLight streetLightData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InHomeDisplayGroup getIHDGroupMembers(String ihdGroupName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConvenienceFeeList getConvenienceFees(
			PaymentTransactionList transactions) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfServiceLocation1 getAllServiceLocations(String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Meters getMetersByCustomerName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GasMeters getGasMetersByAccountNumber(String accountNumber,
			String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfServiceLocation1 getServiceLocationByGridLocation(
			String gridLocation, ServiceType serviceType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject modifyCBDataForServiceLocations(
			ArrayOfServiceLocation1 serviceLocationData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfBillingAccountLoad getBillingAccountLoadDataByMonth(
			int month, int year, String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject cdStateNotification(CDState state,
			String transactionID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Meters getAllMetersByAccountNumber(String accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfServiceLocation1 getServiceLocationByShutOffDate(
			XMLGregorianCalendar shutOffDate, ServiceType serviceType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject assignmentNotification(
			ArrayOfAssignment assignments, String transactionID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfAccount1 getAccountsByCustomerID(String customerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentTransactionList commitPaymentTransaction(
			PaymentTransactionList transactions) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfServiceLocation1 getServiceLocationByServiceLocationID(
			String serviceLocationId, ServiceType serviceType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PayableItemList getPayableItemsList(String accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Meters getMetersBySearchString(String searchString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfCustomer getAllCustomersByServiceType(
			ServiceType serviceType, String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Meters getAllMeters(String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject transformerBankChangedNotification(
			ArrayOfTransformerBank changedXfmrBanks) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfServiceOrder1 getServiceOrdersByServiceLocation(
			String serviceLocationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfServiceLocation1 getServiceLocationByPhaseCode(
			PhaseCode phaseCode, String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject cdStateChangedNotification(
			CDStateChange stateChange, String transactionID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WaterMeters getWaterMetersByAccountNumber(String accountNumber,
			String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject modifyCBDataForCustomer(
			ArrayOfCustomer customerData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerByDBAName(String dBAName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject intervalDataNotification(
			IntervalData intervalReads, String transactionID, String errorString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfBillingDetail getBillingDetail(String accountNumber,
			XMLGregorianCalendar cisBillDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Meters getMetersByHomePhone(TelephoneNumber phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject modifyCBDataForPole(ArrayOfPole poleData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pole getPoleByPoleNumberFromCB(String poleNumber) {
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
	public ArrayOfErrorObject loadProfileChangedNotification(
			ArrayOfProfileObject changedLoadProfiles) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject historyLogChangedNotification(
			ArrayOfHistoryLog changedHistoryLogs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfAccount1 getAllAccounts(String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServiceLocationIDByAccountNumber(String accountNumber,
			ServiceType serviceType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject meterTestNotification(
			ArrayOfTestedElectricMeter tests) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ElectricMeters getElectricMetersByAccountNumber(
			String accountNumber, String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfPpmBalanceAdjustment getPPMBalanceAdjustments(
			XMLGregorianCalendar startTime, XMLGregorianCalendar stopTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerByMeterID(MeterID meterID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject unregisterForService(String registrationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfString18 getDomainNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServiceLocationIDByMeter(MeterID meterID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfServiceLocation1 getServiceLocationByMeterID(MeterID meterID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account getAccountByMeterIDAndServiceType(MeterID meterID,
			ServiceType serviceType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject cdDeviceExchangeNotification(
			ArrayOfCDDeviceExchange cddChangeout) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfUsage getUsageByMonth(int monthNumber, String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Meters getModifiedMeters(String previousSessionID,
			String lastReceived, ServiceType serviceType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegistrationInfo getRegistrationInfoByID(String registrationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransformerBank getTransformerBankByUnitIDFromCB(String unitID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject cdDeviceInstalledNotification(
			ArrayOfCDDevice1 installedCDDs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject inHomeDisplayExchangeNotification(
			ArrayOfInHomeDisplayExchange ihdChangeout) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject modifyCBDataForMeters(Meters meterData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfServiceLocation1 getAllServiceLocationsByServiceType(
			ServiceType serviceType, String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfDomainMember getDomainMembers(String domainName) {
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
	public Meters getMeterByMeterID(MeterID meterID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerByCustomerID(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Meters getMetersBySiteID(String siteID, ServiceType serviceType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfString18 getMeterGroupNamesByMeterID(MeterID meterID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfCustomer getCustomerByName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String requestRegistrationID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject meterConnectivityNotification(
			ArrayOfMeterConnectivity newConnectivity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfStreetLight getAllStreetLights(String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfServiceLocation1 getServiceLocationByCustomerID(
			String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BilledUsage getBilledUsage(String accountNumber,
			XMLGregorianCalendar cisBillDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject readingScheduleResultNotification(
			ArrayOfReadingScheduleResult scheduleResult, String transactionID,
			String errorString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MeterBase getMeterBaseByObjectID(String meterBaseID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject usageMonitoringNotification(ArrayOfMeterID1 meters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfErrorObject pingURL() {
		ArrayOfErrorObject aoe = new ArrayOfErrorObject();
		List<ErrorObject> list = aoe.getErrorObject();
		ErrorObject eo = new ErrorObject();
		eo.setErrorString("Sixthc Response");
		list.add(eo);
		return aoe;
	}

	@Override
	public ArrayOfErrorObject writeAccountHistoryComments(
			ArrayOfHistoryComment comments) {
		// TODO Auto-generated method stub
		return null;
	}

}
