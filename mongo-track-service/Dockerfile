FROM openjdk:11
WORKDIR usr/src
VOLUME /home/test/Documents/datadir:/data/db
ADD target/track-service-0.0.1-SNAPSHOT.jar /usr/src/track-service-0.0.1-SNAPSHOT.jar
EXPOSE 8095
ENTRYPOINT ["java", "-jar","/usr/src/track-service-0.0.1-SNAPSHOT.jar" ]