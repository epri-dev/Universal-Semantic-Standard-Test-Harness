package com.sixthc.server.ws;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Vector;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;

import org.ucaiug.osgug._2010._06.schema.header.MessageHeaderType;
import org.ucaiug.osgug._2010._06.schema.reply.ErrorType;
import org.ucaiug.osgug._2010._06.schema.reply.ReplyType;
import org.ucaiug.osgug.ns._2010._06.wsoadr.wsdl.senddreventoptout.DREventOptOut;
import org.ucaiug.osgug.ns._2010._06.wsoadr.wsdl.senddreventoptout.FaultReturn;

public class DREventOptOutImpl implements DREventOptOut {

	@Override
	public void createdDREventOptOut(
			MessageHeaderType header,
			ReplyType reply,
			org.ucaiug.osgug.ns._2010._06.wsoadr.dreventoptout.DREventOptOut payload,
			Holder<XMLGregorianCalendar> creationTime,
			Holder<String> description, Holder<List<String>> id,
			Holder<String> replyCode, Holder<String> result,
			Holder<ErrorType> error) throws FaultReturn {

		// creation time
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTimeInMillis(System.currentTimeMillis());
		try {
			XMLGregorianCalendar xcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
			creationTime.value = xcal;
		} catch (DatatypeConfigurationException e) {
			throw new FaultReturn("Failed to create xcal entry");
		}
		
		description.value = "Sixthc Testing";
		
		List<String> ids = new Vector<String>();
		ids.add("0.1a");
		id.value = ids;

		replyCode.value = "Success";
		
		result.value = "okay";
		
		error.value = new ErrorType();
		error.value.setCode("okay");
	}
}
