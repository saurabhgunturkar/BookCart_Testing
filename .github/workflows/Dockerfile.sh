# Use the official Maven image as the base image
FROM maven:3.8.5-openjdk-17

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml file and the source code
COPY pom.xml .
COPY src ./src

# Package the application using Maven
RUN mvn clean package

# Use the official OpenJDK image as the runtime base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged JAR file from the Maven build image
COPY --from=0 /app/target/my-app.jar .

# Specify the command to run the application
CMD ["java", "-jar", "my-app.jar"]
