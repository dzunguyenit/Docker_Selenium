FROM ubuntu
FROM openjdk:17-jdk-alpine
FROM maven:3.9.4-eclipse-temurin-17-alpine

WORKDIR /app
COPY . .
#download and install chrome
RUN wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
#ENTRYPOINT [ "mvn", "test" ]