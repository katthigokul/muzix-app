FROM openjdk:11
WORKDIR usr/src
ADD ./target/APIGatewayService-0.0.1-SNAPSHOT.jar /usr/src/APIGatewayService-0.0.1-SNAPSHOT.jar
EXPOSE 8000
ENTRYPOINT ["java", "-jar","/usr/src/APIGatewayService-0.0.1-SNAPSHOT.jar" ]