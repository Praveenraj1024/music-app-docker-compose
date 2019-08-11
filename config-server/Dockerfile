FROM openjdk:11
WORKDIR usr/src
VOLUME /home/test/Documents/datadir:/data/db
ADD target/config-server-0.0.1-SNAPSHOT.jar /usr/src/config-server-0.0.1-SNAPSHOT.jar
EXPOSE 8040
ENTRYPOINT ["java", "-jar","/usr/src/config-server-0.0.1-SNAPSHOT.jar" ]