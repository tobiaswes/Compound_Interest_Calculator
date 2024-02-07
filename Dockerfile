FROM openjdk:21

WORKDIR app
COPY target/Compound_Interest-0.0.1-SNAPSHOT.jar /app/Compound_Interest-0.0.1-SNAPSHOT.jar
EXPOSE 8081

CMD ["java", "-jar", "Compound_Interest-0.0.1-SNAPSHOT.jar"]