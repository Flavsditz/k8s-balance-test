FROM gradle:5.6.0-jdk8 as build
WORKDIR /metric-test
COPY build.gradle build.gradle
COPY settings.gradle settings.gradle
COPY src src
COPY conf conf
RUN gradle shadowJar

FROM openjdk:8-jdk-slim
WORKDIR /metric-test
COPY --from=build /metric-test/build/libs/metric-test-1.0.0-all.jar app.jar
COPY conf conf
EXPOSE 3000
CMD ["java", "-jar", "app.jar"]
