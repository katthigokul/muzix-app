FROM openjdk:11
WORKDIR usr/src
VOLUME /home/test/Documents/datadir:/data/db
ADD ./target/eureka-server-0.0.1-SNAPSHOT.jar /usr/src/eureka-server-0.0.1-SNAPSHOT.jar
EXPOSE 7777
ENTRYPOINT ["java", "-jar","/usr/src/eureka-server-0.0.1-SNAPSHOT.jar" ]