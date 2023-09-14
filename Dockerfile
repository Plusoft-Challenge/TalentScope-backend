FROM eclipse-temurin:17-jdk-alpine

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} TalentScope-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/TalentScope-0.0.1-SNAPSHOT.jar"]