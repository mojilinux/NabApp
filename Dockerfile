FROM openjdk:17-jdk-alpine
ADD target/NabApp.war target/NabApp.war
EXPOSE 80
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod","target/NabApp.war"]