FROM openjdk:8-jdk-alpine

COPY build/libs/kotlinsample.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]