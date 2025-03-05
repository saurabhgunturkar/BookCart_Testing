# Use the official Maven image as the base image
FROM maven:3.8.5-openjdk-17

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml file and the source code
COPY pom.xml .
COPY src ./src

# Run Maven tests with detailed logging
RUN mvn clean test -e || mvn clean test -X

# Copy the test reports to a location where you can inspect them
RUN mkdir -p /app/test-reports && cp -r target/surefire-reports /app/test-reports

# Package the application using Maven
RUN mvn package

# Use the official OpenJDK image as the runtime base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged JAR file from the Maven build image
COPY --from=0 /app/target/my-app.jar .

# Copy the test reports to the runtime container
COPY --from=0 /app/test-reports /app/test-reports

# Specify the command to run the application
CMD ["java", "-jar", "my-app.jar"]
