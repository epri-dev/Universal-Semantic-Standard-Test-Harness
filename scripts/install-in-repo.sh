mvn install:install-file \
-Dfile=../target/epriConnect.jar \
-DgroupId=epri-server \
-DartifactId=epri \
-Dversion=0.1 \
-Dpackaging=jar \
-DgeneratePom=true
