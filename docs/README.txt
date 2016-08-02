Overview of EPRI project build structure and notes
Abstract
So.... this is a maven project. This document presents information necessary to build and deploy the war file. Please update if you find missing steps.

Basic Setup (before you can build this yourself)
1. Install maven if it's not already on your system. It probably is.
2. The project requires jta and ojdbc to run. These jars are not available from the maven repository due to legal issues so they must be downloaded and installed into the local repository by hand. See the readme.txt file in thirdparty for how to load these into your local repository.

Note; if there is a maven repository for mysql, then this isn't necessary as the dependency for that site can be placed directly in the pom.xml file.

At this point, you should be able to build the war file.

Building the Project

1. Generating the wsdl. The java code is already generated and exists in the target directory. However, if new wsdls are added, the way to create java is: 

mvn generate-sources

2. Building the war file. The war file can be dropped into $TOMCAT/webapps and will unjar itself. The command to build it (I generally clean and then build just because is):

mvn clean package


Notes and Tips because Spring is all about configuration

1. The project uses spring
2. The project uses log4j
3. The project uses hibernate
4. The project uses cxf
5. It's all about the config files (sigh)

Config files and their hierarchy

|-META-INF
   |+WEB-INF
   |---web.xml [top level]
   |--+classes
   |-----application-context.xml [web.xml]
   |----+resources
   |------+spring
   |--------+config
   |-----------database.properties [web.xml -> application-context.xml -> DataSource.xml]
   |-----------DataSource.xml [web.xml -> application- context.xml]
   |-----------Hibernate.xml [web.xml -> application-context.xml]


1. web.xlm is the top level of configuration files. All other files flow from there.
a. The logging configuration file location and setup is the first section of this file. The location of the logging configuration file is given, along with a spring listener to load the data.

b. The most important configuration information from web.xml is the spring load. The context params are critical here. They state to look for a file called application-context.xml, which is placed under the top level classes directory under WEB-INF.

2. application-context.xml references the DataSource.xml and the Hibernate.xml files.
a. The DataSource (along with its property file database.properties) sets up the connect to oracle, mysql.
b. The Hibernate.xml file sets the database dialect and maps the DAO classes (in this case so far; requestDao).

@autowiring
I used a hibernate concept called autowiring to automatically insert a session variable into the server implementation classes. Look at the Hibernate.xml for how this was done. This can be duplicated to add (for example) an error logging table.

The key for creating an autowired dao is the Hibernate.xml (and in the case of request), RequestDao.java (interface), RequestDaoImpl.java (implementation) and CustomHibernateDaoSupport.java. Check out the DisconnectImpl.java class (the web service implementation) and you will see that with a simple @Autowired directive, followed by a variable, we have our link to our db.
