package com.sixthc.interceptor;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.apache.log4j.Logger;

public class WebApplicationExceptionMapper implements
		ExceptionMapper<WebApplicationException> {
	private static Logger logger = Logger
			.getLogger(WebApplicationExceptionMapper.class);

	@Override
	public Response toResponse(WebApplicationException ex) {
		if (ex.getResponse().getStatus() == Response.Status.INTERNAL_SERVER_ERROR
				.getStatusCode()) {
			logger.error("Request failed server internal error");
			/*
			 * By returning a null, we will cause the fault interceptor to be
			 * called. This is a kludge!
			 */
			return null;
		}
		return ex.getResponse();
	}
}