FROM ubuntu
WORKDIR /app
COPY . .

FROM openjdk:17-jdk-alpine
FROM selenium/standalone-chrome

RUN docker run -d -p 4444:4444 selenium/standalone-chrome:latest
FROM maven:3.9.4-eclipse-temurin-17-alpine

#ENTRYPOINT [ "mvn", "test" ]