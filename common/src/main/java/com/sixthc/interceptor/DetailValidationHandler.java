package com.sixthc.interceptor;

import javax.xml.bind.ValidationEvent;
import javax.xml.bind.helpers.DefaultValidationEventHandler;

import org.apache.log4j.Logger;

public class DetailValidationHandler extends DefaultValidationEventHandler {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(DetailValidationHandler.class);

	@Override
	public boolean handleEvent(ValidationEvent event) {
		log.debug("handleEvent called");

		if (event.getSeverity() == ValidationEvent.WARNING) {
			return super.handleEvent(event);
		} else {
			log.debug("message => " + event.getMessage());
			log.debug("line number => " + event.getLocator().getLineNumber());
			throw new RuntimeException(event.getMessage() + " [line:"
					+ event.getLocator().getLineNumber() + "]");
		}
	}
}
