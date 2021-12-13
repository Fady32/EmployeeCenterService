# Build stage
FROM maven:3.6.0 AS build
COPY pom.xml /
COPY src /src
RUN mvn -f /pom.xml clean package


# Run stage
FROM openjdk:11-jre-slim
COPY --from=build /target/*.jar /EmployeService.jar
EXPOSE 8080/tcp
EXPOSE 8080/udp
ENTRYPOINT ["java","-jar","/EmployeService.jar"]

# docker build -f execute.Dockerfile -t springboot

# docker run -d -p 8080:8080 -t spring-boot
