FROM openjdk:11
WORKDIR usr/src
ADD ./target/config-server-0.0.1-SNAPSHOT.jar /usr/src/config-server-0.0.1-SNAPSHOT.jar
EXPOSE 8891
ENTRYPOINT ["java", "-jar","/usr/src/config-server-0.0.1-SNAPSHOT.jar" ]