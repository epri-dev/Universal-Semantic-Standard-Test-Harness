package com.sixthc.server.ws;

import javax.xml.ws.Dispatch;
import javax.xml.ws.EndpointReference;
import javax.xml.ws.WebServiceFeature;

import org.example.utilityoperator.UtilityOperator_Service;

public class UtilityOperator extends UtilityOperator_Service {

	@Override
	public <T> Dispatch<T> createDispatch(EndpointReference arg0,
			Class<T> arg1, Mode arg2, WebServiceFeature... arg3) {
		// TODO Auto-generated method stub
		return super.createDispatch(arg0, arg1, arg2, arg3);
	}

}
