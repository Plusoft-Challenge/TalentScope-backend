FROM openjdk:17

WORKDIR /app

COPY . /app/

EXPOSE 8080

RUN sed -i 's/\r$//' mvnw

RUN chmod +x mvnw

RUN ./mvnw clean package

CMD ["java", "-jar", "target//TalentScope-0.0.1-SNAPSHOT.jar"]