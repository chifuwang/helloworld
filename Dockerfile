FROM docker.io/library/maven:3.8.3-openjdk-17 as builder
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM docker.io/library/eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY --from=builder /home/app/target/${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"] 