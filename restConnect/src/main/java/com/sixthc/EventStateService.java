package com.sixthc;

import eventstate.EventState;




public interface EventStateService {
	public EventState getEventState(Long id) throws EventNotFound;
}
