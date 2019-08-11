FROM openjdk:11
WORKDIR usr/src
VOLUME /home/test/Documents/datadir:/data/db
ADD target/userservice-0.0.1-SNAPSHOT.jar /usr/src/userservice-0.0.1-SNAPSHOT.jar
EXPOSE 8100
ENTRYPOINT ["java", "-jar","/usr/src/userservice-0.0.1-SNAPSHOT.jar" ]