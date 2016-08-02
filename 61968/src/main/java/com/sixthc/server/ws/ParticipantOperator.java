package com.sixthc.server.ws;

import javax.xml.ws.Holder;

import logs.ListOfDRASClientAlarms;
import logs.ListOfTransactionLogs;
import optoutstate.ListOfOptOutStates;
import optoutstate.OptOutState;
import participantaccount.ListOfParticipantAccountIDs;
import participantaccount.ListOfParticipantAccounts;
import participantaccount.ParticipantAccount;
import programconstraint.DateTimeWindow;
import programconstraint.ListOfProgramConstraints;
import programconstraint.ProgramConstraint;
import responseschedule.ResponseSchedule;
import utilityprogram.ListOfIDs;
import utilityprogram.ListOfProgramNames;
import utilityprogram.ParticipantList;
import bid.Bid;
import drasclient.DRASClient;
import drasclient.ListOfCommsStatus;
import drasclient.ListOfDRASClients;
import eventinfo.ListOfEventInfoType;
import feedback.FeedBack;
import feedback.ListOfFeedback;


public class ParticipantOperator implements org.example.participantoperator.ParticipantOperator {

	@Override
	public String deleteDRASClient(String drasClientID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setDREventFeedback(FeedBack feedBack) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListOfProgramConstraints getParticipantProgramConstraints(
			ListOfParticipantAccountIDs participantIDs, String programName,
			String participantGroup) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListOfFeedback getDREventFeedback(ListOfIDs drasClientIDs,
			ListOfIDs participantIDs, ListOfIDs programNames,
			DateTimeWindow timeInterval, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String submitStandingBid(Bid bid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTestModeState(String drasClientID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setDRASClientProgramConstraints(ListOfIDs drasClientIDs,
			ListOfParticipantAccountIDs participantIDs,
			String participantGroup, ProgramConstraint programConstraint) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setParticipantProgramConstraints(
			ListOfParticipantAccountIDs participantIDs,
			String participantGroup, ProgramConstraint programConstraint) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String modifyParticipantAccounts(
			ListOfParticipantAccountIDs participantIDs,
			String participantGroup, ParticipantAccount participantAccount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setTestModeState(String drasClientID,
			String opertaionModeValue, String eventStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListOfTransactionLogs getDRASTransactions(ListOfIDs userNames,
			ListOfIDs drasClientIDs, ListOfIDs participantIDs,
			String methodName, DateTimeWindow timeInterval, String resultCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteOptOutState(String optOutStateID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListOfOptOutStates getOptOutStates(String participantID,
			String programName, String drasClientID, String optOutID,
			String eventID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListOfParticipantAccounts getParticipantAccounts(
			ListOfParticipantAccountIDs participantIDs, String participantGroup) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListOfCommsStatus getDRASClientCommsStatus(
			ParticipantList participants, ListOfProgramNames programNames) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createOptOutState(OptOutState optOutState) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bid getBid(String eventID, String participantID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteResponseSchedule(String programName, String drasClientID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bid getStandingBid(String participantID, String programName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListOfDRASClients getDRASClientInfo(ListOfIDs drasClientIDs,
			ListOfParticipantAccountIDs participantIDs, String participantGroup) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteParticipantProgramConstraints(
			ListOfParticipantAccountIDs participantIDs,
			String participantGroup, String programName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setTestMode(String drasClientID, String mode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStandingBid(String participantID, String programName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseSchedule getResponseSchedule(String programName,
			String drasClientID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createDRASClient(DRASClient drasClient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String submitBid(Bid bid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getProgramInformation(String programName, String drasClientID,
			Holder<ProgramConstraint> programConstraints,
			Holder<ListOfEventInfoType> eventInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ListOfProgramConstraints getDRASClientProgramConstraints(
			ListOfIDs drasClientIDs,
			ListOfParticipantAccountIDs participantIDs, String participantGroup) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteDRASClientProgramConstraints(ListOfIDs drasClientIDs,
			ListOfParticipantAccountIDs participantIDs,
			String participantGroup, String programName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String modifyDRASClient(DRASClient drasClient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListOfDRASClientAlarms getDRASClientAlarms(ListOfIDs drasClientIDs,
			ListOfIDs participantIDs, DateTimeWindow timeInterval) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createResponseSchedule(ResponseSchedule responseSchedule) {
		// TODO Auto-generated method stub
		return null;
	}


}
