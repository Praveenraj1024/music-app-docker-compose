FROM openjdk:11
WORKDIR usr/src
VOLUME /home/test/Documents/datadir:/data/db
ADD target/api-gateway-pattern-0.0.1-SNAPSHOT.jar /usr/src/api-gateway-pattern-0.0.1-SNAPSHOT.jar
EXPOSE 8020
ENTRYPOINT ["java", "-jar","/usr/src/api-gateway-pattern-0.0.1-SNAPSHOT.jar" ]