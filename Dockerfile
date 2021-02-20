FROM openjdk:8
COPY ./target/shubhang-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "shubhang-1.0-SNAPSHOT.jar", "calculator"]