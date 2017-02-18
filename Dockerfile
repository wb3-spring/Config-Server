FROM openjdk:8
MAINTAINER bill@billbensing.com
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "wb3-configserver.jar"]