FROM openjdk:11
WORKDIR /usrs/src
ADD ./target/userservices-0.0.1-SNAPSHOT.jar /usrs/src/userservices-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usrs/src/userservices-0.0.1-SNAPSHOT.jar"]
