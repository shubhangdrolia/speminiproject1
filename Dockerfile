FROM openjdk:8
COPY ./target/shubhang-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp", "shubhang-1.0-SNAPSHOT-jar-with-dependencies.jar", "calculator"]