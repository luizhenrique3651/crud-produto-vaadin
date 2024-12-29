FROM maven:3.9.9-eclipse-temurin-21 as build

COPY src /app/src
COPY pom.xml /app

WORKDIR /app
RUN mvn clean install -DskipTests

FROM openjdk:21-jdk-oracle

COPY --from=build target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "/app.jar"]
