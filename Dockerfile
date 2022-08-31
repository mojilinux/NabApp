FROM openjdk:17-jdk-alpine
ADD target/NabApp-0.0.1.war target/NabApp-0.0.1.war
EXPOSE 80
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod","target/NabApp-0.0.1.war"]