package com.sixthc;

import java.util.Calendar;
import java.util.Locale;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Service;

@Service("timeService")

public class TimeService {
	@GET
	@Path("/time")
	@Produces("text/plan")
    public String getDateTime()
    {
        DateFormatter formatter = new DateFormatter("dd/MM/yyyy hh:mm:ss");
        return formatter.print(Calendar.getInstance().getTime(), Locale.getDefault());
    }
	
	@GET
	@Path("/xtime")
	@Produces("application/xml")
	public DateTime getXMLDateTime()
	{
		DateTime t =  new DateTime();
		t.setCalender(Calendar.getInstance());
		return t;
	}
	
	
    @GET
    @Path("/hello/{name}")
    @Produces("application/xml")
    public Name getUser(@PathParam("name") String name) {
    	Name n = new Name();
    	n.setName(name);
    	return n;
    }
}

