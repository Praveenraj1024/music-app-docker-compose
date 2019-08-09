FROM openjdk:11
WORKDIR usr/src
ENV MONGO_INITDB_ROOT_USERNAME=root
ENV MONGO_INITDB_ROOT_PASSWORD=test
VOLUME /home/test/Documents/datadir:/data/db
ADD target/track-service-0.0.1-SNAPSHOT.jar /usr/src/track-service-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/usr/src/track-service-0.0.1-SNAPSHOT.jar" ]