FROM openjdk:17-jdk-alpine

# Refer to Maven build -> finalName
ARG JAR_FILE=staging/NabApp-0.0.1-SNAPSHOT.jar

# cd /opt/app
#WORKDIR /opt/app

# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} /NabApp.jar

EXPOSE 80

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod","/NabApp.jar"]
