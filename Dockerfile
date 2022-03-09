FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/address-service-0.0.1-SNAPSHOT.jar address-service.jar
RUN sh -c 'touch /address-service.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/address-service.jar"]
EXPOSE 8083