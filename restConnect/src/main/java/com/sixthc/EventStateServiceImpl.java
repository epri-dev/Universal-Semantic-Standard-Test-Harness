package com.sixthc;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.stereotype.Service;

import eventstate.EventState;

@Service("eventService")
@Produces("application/xml")
public class EventStateServiceImpl implements EventStateService {
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger
			.getLogger(EventStateServiceImpl.class);

	@GET
	@Path("/eventState/{id}")
	@Override
	public EventState getEventState(@PathParam("id") Long id)
			throws EventNotFound {
		log.info("name => " + id);
		EventState e = new EventState();
		e.setEventStateID(id);
		e.setDrasName("Akua1.0");
		e.setEventIdentifier("2081588001");
		log.info("returning event");
		return e;
	}

	@POST
	@Path("/data")
	public String addEvent(String data) {
		log.info("data => " + data);
		return data;
	}

	@POST
	@Path("/event")
	public Response addEvent(EventState eventState) {
		log.info(eventState);
		return Response.status(Status.OK).build();
	}
}
