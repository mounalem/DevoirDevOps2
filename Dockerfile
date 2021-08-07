FROM openjdk
EXPOSE 8080
ADD /target/my-spring-boot-app.jar my-spring-boot-app.jar
ENTRYPOINT ["java", "-jar", "/my-spring-boot-app.jar"]
