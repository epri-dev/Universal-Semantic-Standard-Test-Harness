So new restful project. A few notes to get you started.

This is a spring, cxf project. Note beans.xml and web.xml.

Code :

The two services it runs are TimeService.java and EventStateServiceImpl.java. If you look at them,
you'll see just how simple they are. It's mostly done with spring and annotation.

CXF uses the annotations in the EventState.java code to automatically build the xml and return
it automatically when EventStateServiceImpl.getEventState returns a type of EventState.

I've modified the pom file so that it can run a tomcat engine on the fly, allowing for quick
testing.

Do: mvn tomcat:run

It will bring up the website on 127.0.0.1:9998

The way this rest works, it has the initial url and then if you want to pass parameters, you just
add '/' and the parameter. So to get an event state with a particular ID (I made this up for testing)

http://127.0.0.1:9998/cxf/rest/openADR/eventState/14 (for example)

The tomcat plugin in the pom.xml defines a service with endpoint cxf (you can look in the pom to find it)
I defined the end point 'rest' for all services of this war.
and there are two services, openADR and time (see beans.xml for both services)
the final part (eventState) comes from an annotation in the EventStateServiceImpl.java

And that is how the whole url is made up.

Note, if you call the above example but with a 323 instead of 14 on the end, it puts that value
in the returned eventStateID. This proves it accepted the argument and used it.

Check current system time

http://127.0.0.1:9998/cxf/rest/time/xtime

returns the current time in an xml string.

http://127.0.0.1:9998/cxf/rest/time/time

returns it as text (probably causes it to download to a file, but never mind that)

and finally...

http://127.0.0.1:9998/cxf/rest/hello/bill

causes it to send back a snippet of xml with 'bill' as the data of the name element.

