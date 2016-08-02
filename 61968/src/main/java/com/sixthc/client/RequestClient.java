package com.sixthc.client;

import ch.iec.tc57._2011.schema.message.ReplyType;

import com.sixthc.interceptor.LoggingInInterceptor;
import com.sixthc.interceptor.LoggingOutInterceptor;

public class RequestClient {

	private String cmd;
	protected LoggingInInterceptor loggingInInterceptor;
	protected LoggingInInterceptor loggingInFaultInterceptor;
	protected LoggingOutInterceptor loggingOutInterceptor;
	protected LoggingOutInterceptor loggingOutFaultInterceptor;

	public LoggingInInterceptor getLoggingInInterceptor() {
		return loggingInInterceptor;
	}

	public void setLoggingInInterceptor(
			LoggingInInterceptor loggingInInterceptor) {
		this.loggingInInterceptor = loggingInInterceptor;
	}

	public LoggingInInterceptor getLoggingInFaultInterceptor() {
		return loggingInFaultInterceptor;
	}

	public void setLoggingInFaultInterceptor(
			LoggingInInterceptor loggingInFaultInterceptor) {
		this.loggingInFaultInterceptor = loggingInFaultInterceptor;
	}

	public LoggingOutInterceptor getLoggingOutInterceptor() {
		return loggingOutInterceptor;
	}

	public void setLoggingOutInterceptor(
			LoggingOutInterceptor loggingOutInterceptor) {
		this.loggingOutInterceptor = loggingOutInterceptor;
	}

	public LoggingOutInterceptor getLoggingOutFaultInterceptor() {
		return loggingOutFaultInterceptor;
	}

	public void setLoggingOutFaultInterceptor(
			LoggingOutInterceptor loggingOutFaultInterceptor) {
		this.loggingOutFaultInterceptor = loggingOutFaultInterceptor;
	}

	public void setCmd(String name) {
		this.cmd = name;
	}

	public String getCmd() {
		return cmd;
	}
	
	public ReplyType execute(Object payload) {
		ReplyType reply = new ReplyType();
		reply.setResult("Not Implemented");
		return reply;
	}
}
