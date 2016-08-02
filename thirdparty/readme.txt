In order for these libraries to be usable by maven, run the following commands
or their approximates:

mvn install:install-file -Dfile=./jta-1_0_1B-classes.zip -DgroupId=javax.transaction -DartifactId=jta -Dversion=1.0.1B -Dpackaging=jar

mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc14 -Dversion=10.0.2.0.0 -Dpackaging=jar -Dfile=./ojdbc14.jar
