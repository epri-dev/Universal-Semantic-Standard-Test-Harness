package com.sixthc.interceptor;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.xml.bind.UnmarshalException;

public class UnmarshalExceptionMapper implements
		ExceptionMapper<javax.xml.bind.UnmarshalException> {
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger
			.getLogger(UnmarshalExceptionMapper.class);

	@Override
	public Response toResponse(UnmarshalException arg0) {
		log.info("CAUGHT UNMARSHAL EXCEPTION");
		return null;
	}

}
