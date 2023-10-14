ARG JAVA_VERSION=17
FROM openjdk:${JAVA_VERSION}
COPY target/restapi-0.0.1-SNAPSHOT.jar rest-api.jar
EXPOSE 5000
CMD ["java","-jar","/rest-api.jar"]