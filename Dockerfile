FROM ubuntu
FROM openjdk:17-jdk-alpine
FROM maven:3.9.4-eclipse-temurin-17-alpine

WORKDIR /app
COPY . .
ENTRYPOINT [ "mvn", "test" , "app.jar" ]