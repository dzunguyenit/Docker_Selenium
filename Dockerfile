FROM ubuntu
FROM openjdk:17-jdk-alpine
FROM maven:3.9.4-eclipse-temurin-17-alpine
FROM selenium/standalone-chrome

WORKDIR /app
COPY . .
#ENTRYPOINT [ "mvn", "test" ]