Please note that there is a cxf issue that I was unable to fix,
though it should be fixable using a jaxws external property file.

So, there are two versions of the mr_server and cb_server files.
The mr_server.wsdl and cb_server.wsdl files are the standard files
sent from the client.

The mr_server_special.wsdl and cb_server_special.wsdl files were
modified by me. Diff the files and see the attribute value_fix
was changed to allow cxf to generate the java from the wsdl.

Therefore, there is a special copy resource plugin to copy
${basedir}/special/MeterEvent.java to the correct target directory.

Shrug.

-Ben Goodwin
