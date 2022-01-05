FROM openjdk:8-jdk-alpine
COPY target/devops-demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /app.jar ${0} ${@}"]