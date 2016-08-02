package com.sixthc;

import javax.xml.ws.WebFault;


@WebFault
public class EventNotFound extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 760222179925825981L;
	private String details;

    public EventNotFound(String details) {
        super();
        this.details = details;
    }

    public String getFaultInfo() {
        return details;
    }
}
