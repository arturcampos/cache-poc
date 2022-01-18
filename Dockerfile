# syntax=docker/dockerfile:1
FROM openjdk:11
EXPOSE 8080
COPY target/cache-poc*.jar app.jar
ENTRYPOINT ["java","-jar","-Duser.timezone=America/Sao_Paulo","-Duser.country=BR","-Duser.language=pt", "-Dspring.profile=docker","/app.jar"]