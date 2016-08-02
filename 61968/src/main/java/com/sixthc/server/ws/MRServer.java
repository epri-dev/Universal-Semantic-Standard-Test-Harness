package com.sixthc.server.ws;

import java.util.List;

import org.multispeak.version_4.*;
import org.multispeak.version_4_1_release.MRServerSoap;

public class MRServer implements MRServerSoap {

	@Override
	public CustomerChangedNotificationResponse customerChangedNotification(
			CustomerChangedNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InitiateMeterReadingsByMeterIDResponse initiateMeterReadingsByMeterID(
			InitiateMeterReadingsByMeterID parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RemoveMetersFromMeterGroupResponse removeMetersFromMeterGroup(
			RemoveMetersFromMeterGroup parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetLatestReadingByMeterIDAndFieldNameResponse getLatestReadingByMeterIDAndFieldName(
			GetLatestReadingByMeterIDAndFieldName parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetPublishMethodsResponse getPublishMethods(
			GetPublishMethods parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceOrderClosedNotificationResponse serviceOrderClosedNotification(
			ServiceOrderClosedNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetSupportedFieldNamesResponse getSupportedFieldNames(
			GetSupportedFieldNames parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CancelUsageMonitoringResponse cancelUsageMonitoring(
			CancelUsageMonitoring parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ScheduleGroupMeterReadingResponse scheduleGroupMeterReading(
			ScheduleGroupMeterReading parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetLatestMeterReadingsByMeterGroupResponse getLatestMeterReadingsByMeterGroup(
			GetLatestMeterReadingsByMeterGroup parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MeterRetireNotificationResponse meterRetireNotification(
			MeterRetireNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeleteScheduleResponse deleteSchedule(DeleteSchedule parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DomainMembersChangedNotificationResponse domainMembersChangedNotification(
			DomainMembersChangedNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DisableReadingScheduleResponse disableReadingSchedule(
			DisableReadingSchedule parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InitiateMeterReadingByMeterIDAndFieldNameResponse initiateMeterReadingByMeterIDAndFieldName(
			InitiateMeterReadingByMeterIDAndFieldName parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetMethodsResponse getMethods(GetMethods parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetSupportedReadingStatusCodesResponse getSupportedReadingStatusCodes(
			GetSupportedReadingStatusCodes parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InitiateDemandResetResponse initiateDemandReset(
			InitiateDemandReset parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeleteReadingScheduleResponse deleteReadingSchedule(
			DeleteReadingSchedule parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceOrderOpenedNotificationResponse serviceOrderOpenedNotification(
			ServiceOrderOpenedNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetHistoryLogByMeterIDResponse getHistoryLogByMeterID(
			GetHistoryLogByMeterID parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetReadingsByMeterIDAndFieldNameResponse getReadingsByMeterIDAndFieldName(
			GetReadingsByMeterIDAndFieldName parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetLPReadingsByDateIntervalDataResponse getLPReadingsByDateIntervalData(
			GetLPReadingsByDateIntervalData parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetReadingsByDateAndFieldNameIntervalDataResponse getReadingsByDateAndFieldNameIntervalData(
			GetReadingsByDateAndFieldNameIntervalData parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InitiateGroupMeterReadingResponse initiateGroupMeterReading(
			InitiateGroupMeterReading parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CancelPlannedOutageResponse cancelPlannedOutage(
			CancelPlannedOutage parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MeterBaseRemoveNotificationResponse meterBaseRemoveNotification(
			MeterBaseRemoveNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InsertMeterInMeterGroupResponse insertMeterInMeterGroup(
			InsertMeterInMeterGroup parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetReadingsByDateResponse getReadingsByDate(
			GetReadingsByDate parameters) {
		GetReadingsByDateResponse resp = new GetReadingsByDateResponse();

		
		MeterReading mr = new MeterReading();
		mr.setDeviceID("1234");
		mr.setComments("Test");
		
		ArrayOfMeterReading1 meterReading = new ArrayOfMeterReading1();
		List<MeterReading> list = meterReading.getMeterReading();
		list.add(mr);
		
		resp.setGetReadingsByDateResult(meterReading);

		return resp;
	}

	@Override
	public GetAMRSupportedMetersResponse getAMRSupportedMeters(
			GetAMRSupportedMeters parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InitiatePlannedOutageResponse initiatePlannedOutage(
			InitiatePlannedOutage parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetReadingByMeterIDIntervalDataResponse getReadingByMeterIDIntervalData(
			GetReadingByMeterIDIntervalData parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeleteMeterGroupResponse deleteMeterGroup(DeleteMeterGroup parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetLatestReadingByMeterIDAndFieldNameIntervalDataResponse getLatestReadingByMeterIDAndFieldNameIntervalData(
			GetLatestReadingByMeterIDAndFieldNameIntervalData parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstablishMeterGroupResponse establishMeterGroup(
			EstablishMeterGroup parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MeterRemoveNotificationResponse meterRemoveNotification(
			MeterRemoveNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InitiateLPMeterReadingsByMeterIDResponse initiateLPMeterReadingsByMeterID(
			InitiateLPMeterReadingsByMeterID parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IsAMRMeterResponse isAMRMeter(IsAMRMeter parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstablishReadingSchedulesResponse establishReadingSchedules(
			EstablishReadingSchedules parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetHistoryLogsByDateResponse getHistoryLogsByDate(
			GetHistoryLogsByDate parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MeterBaseAddNotificationResponse meterBaseAddNotification(
			MeterBaseAddNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetLatestReadingsByMeterListFormattedBlockResponse getLatestReadingsByMeterListFormattedBlock(
			GetLatestReadingsByMeterListFormattedBlock parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InHomeDisplayRetireNotificationResponse inHomeDisplayRetireNotification(
			InHomeDisplayRetireNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceLocationChangedNotificationResponse serviceLocationChangedNotification(
			ServiceLocationChangedNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetConfigurationGroupNamesResponse getConfigurationGroupNames(
			GetConfigurationGroupNames parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetReadingSchedulesResponse getReadingSchedules(
			GetReadingSchedules parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MeterBaseExchangeNotificationResponse meterBaseExchangeNotification(
			MeterBaseExchangeNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MeterBaseRetireNotificationResponse meterBaseRetireNotification(
			MeterBaseRetireNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetHistoryLogsByDateAndEventCodeResponse getHistoryLogsByDateAndEventCode(
			GetHistoryLogsByDateAndEventCode parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MeterChangedNotificationResponse meterChangedNotification(
			MeterChangedNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetLatestReadingsResponse getLatestReadings(
			GetLatestReadings parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetReadingsByMeterIDResponse getReadingsByMeterID(
			GetReadingsByMeterID parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MeterAddNotificationResponse meterAddNotification(
			MeterAddNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MeterExchangeNotificationResponse meterExchangeNotification(
			MeterExchangeNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetReadingsByDateFormattedBlockResponse getReadingsByDateFormattedBlock(
			GetReadingsByDateFormattedBlock parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EndDeviceShipmentNotificationResponse endDeviceShipmentNotification(
			EndDeviceShipmentNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MeterBaseChangedNotificationResponse meterBaseChangedNotification(
			MeterBaseChangedNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetHistoryLogsByMeterIDAndEventCodeResponse getHistoryLogsByMeterIDAndEventCode(
			GetHistoryLogsByMeterIDAndEventCode parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetSchedulesResponse getSchedules(GetSchedules parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetReadingsByBillingCycleResponse getReadingsByBillingCycle(
			GetReadingsByBillingCycle parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetLatestReadingsByMeterListIntervalDataResponse getLatestReadingsByMeterListIntervalData(
			GetLatestReadingsByMeterListIntervalData parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetLatestReadingByMeterIDResponse getLatestReadingByMeterID(
			GetLatestReadingByMeterID parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CancelDisconnectedStatusResponse cancelDisconnectedStatus(
			CancelDisconnectedStatus parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetReadingsByUOMAndDateResponse getReadingsByUOMAndDate(
			GetReadingsByUOMAndDate parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdateServiceLocationDisplaysResponse updateServiceLocationDisplays(
			UpdateServiceLocationDisplays parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetReadingsByBillingCycleIntervalDataResponse getReadingsByBillingCycleIntervalData(
			GetReadingsByBillingCycleIntervalData parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetLPDataByMeterIDResponse getLPDataByMeterID(
			GetLPDataByMeterID parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InHomeDisplayRemoveNotificationResponse inHomeDisplayRemoveNotification(
			InHomeDisplayRemoveNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetScheduleByIDResponse getScheduleByID(GetScheduleByID parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetLatestReadingsByMeterIDListIntervalDataResponse getLatestReadingsByMeterIDListIntervalData(
			GetLatestReadingsByMeterIDListIntervalData parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstablishSchedulesResponse establishSchedules(
			EstablishSchedules parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InitiateMeterReadingByObjectResponse initiateMeterReadingByObject(
			InitiateMeterReadingByObject parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InitiateDisconnectedStatusResponse initiateDisconnectedStatus(
			InitiateDisconnectedStatus parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RemoveMetersFromConfigurationGroupResponse removeMetersFromConfigurationGroup(
			RemoveMetersFromConfigurationGroup parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetLPReadingsByDateFormattedBlockResponse getLPReadingsByDateFormattedBlock(
			GetLPReadingsByDateFormattedBlock parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EnableReadingSchedulesResponse enableReadingSchedules(
			EnableReadingSchedules parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetLatestMeterReadingsByMeterGroupIntervalDataResponse getLatestMeterReadingsByMeterGroupIntervalData(
			GetLatestMeterReadingsByMeterGroupIntervalData parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountChangedNotificationResponse accountChangedNotification(
			AccountChangedNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetLatestReadingByFieldNameIntervalDataResponse getLatestReadingByFieldNameIntervalData(
			GetLatestReadingByFieldNameIntervalData parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetLPReadingsByMeterIDIntervalDataResponse getLPReadingsByMeterIDIntervalData(
			GetLPReadingsByMeterIDIntervalData parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetReadingScheduleByIDResponse getReadingScheduleByID(
			GetReadingScheduleByID parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DomainNamesChangedNotificationResponse domainNamesChangedNotification(
			DomainNamesChangedNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InHomeDisplayAddNotificationResponse inHomeDisplayAddNotification(
			InHomeDisplayAddNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetReadingsByDateAndFieldNameResponse getReadingsByDateAndFieldName(
			GetReadingsByDateAndFieldName parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomersAffectedByOutageNotificationResponse customersAffectedByOutageNotification(
			CustomersAffectedByOutageNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetLPReadingsByMeterIDFormattedBlockResponse getLPReadingsByMeterIDFormattedBlock(
			GetLPReadingsByMeterIDFormattedBlock parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MeterTestNotificationResponse meterTestNotification(
			MeterTestNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetConfigurationGroupNamesByMeterIDResponse getConfigurationGroupNamesByMeterID(
			GetConfigurationGroupNamesByMeterID parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UnregisterForServiceResponse unregisterForService(
			UnregisterForService parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InHomeDisplayChangedNotificationResponse inHomeDisplayChangedNotification(
			InHomeDisplayChangedNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetReadingsByMeterIDAndFieldNameIntervalDataResponse getReadingsByMeterIDAndFieldNameIntervalData(
			GetReadingsByMeterIDAndFieldNameIntervalData parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetDomainNamesResponse getDomainNames(GetDomainNames parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetLPReadingsByBillingCycleIntervalDataResponse getLPReadingsByBillingCycleIntervalData(
			GetLPReadingsByBillingCycleIntervalData parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetLatestReadingByFieldNameResponse getLatestReadingByFieldName(
			GetLatestReadingByFieldName parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetModifiedAMRMetersResponse getModifiedAMRMeters(
			GetModifiedAMRMeters parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InitiateUsageMonitoringResponse initiateUsageMonitoring(
			InitiateUsageMonitoring parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetRegistrationInfoByIDResponse getRegistrationInfoByID(
			GetRegistrationInfoByID parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetConfigurationGroupMembersResponse getConfigurationGroupMembers(
			GetConfigurationGroupMembers parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetLatestReadingsByMeterIDListResponse getLatestReadingsByMeterIDList(
			GetLatestReadingsByMeterIDList parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetReadingByMeterIDFormattedBlockResponse getReadingByMeterIDFormattedBlock(
			GetReadingByMeterIDFormattedBlock parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InHomeDisplayExchangeNotificationResponse inHomeDisplayExchangeNotification(
			InHomeDisplayExchangeNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InsertMeterInConfigurationGroupResponse insertMeterInConfigurationGroup(
			InsertMeterInConfigurationGroup parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetLPReadingsByBillingCycleResponse getLPReadingsByBillingCycle(
			GetLPReadingsByBillingCycle parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetDomainMembersResponse getDomainMembers(GetDomainMembers parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegisterForServiceResponse registerForService(
			RegisterForService parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RequestRegistrationIDResponse requestRegistrationID(
			RequestRegistrationID parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetReadingsByDateIntervalDataResponse getReadingsByDateIntervalData(
			GetReadingsByDateIntervalData parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceOrderChangedNotificationResponse serviceOrderChangedNotification(
			ServiceOrderChangedNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MeterConnectivityNotificationResponse meterConnectivityNotification(
			MeterConnectivityNotification parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetFormattedBlockTemplatesResponse getFormattedBlockTemplates(
			GetFormattedBlockTemplates parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InitiateMeterReadingsByFieldNameResponse initiateMeterReadingsByFieldName(
			InitiateMeterReadingsByFieldName parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PingURLResponse pingURL(PingURL parameters) {
		// TODO Auto-generated method stub
		return null;
	}

}
