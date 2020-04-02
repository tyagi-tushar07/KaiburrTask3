FROM openjdk:8
ADD target/docker-kaiburr.jar docker-kaiburr.jar
ENTRYPOINT ["java", "-jar", "docker-kaiburr.jar"]