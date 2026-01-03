FROM amazoncorretto:17
COPY target/simple-aws-app.jar simple-aws-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","simple-aws-app.jar"]