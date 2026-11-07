# Use Eclipse Temurin Java 17 base image
FROM eclipse-temurin:17-jre-jammy

# Set working directory inside the container
WORKDIR /app

# Copy the built jar file from Maven's target directory into the container
COPY target/*.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]