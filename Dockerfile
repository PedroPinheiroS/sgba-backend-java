FROM openjdk:8
ADD target/sgba-springboot-application.jar sgba-springboot-application.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "sgba-springboot-application.jar"]