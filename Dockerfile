FROM openjdk:8u111-alpine
# FROM eclipse-temurin:17-jdk-alpine

# RUN apk update -y
# RUN adduser -h /home/usrapp -s /bin/bash -D usrapp

USER usrapp

WORKDIR /app

COPY target/app-0.0.1-SNAPSHOT.jar ./app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]

#docker image build -t javaspringboot .