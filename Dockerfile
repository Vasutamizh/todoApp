# Use a lightweight Java 17 runtime
FROM eclipse-temurin:17-jdk-alpine

# Set working directory inside container
WORKDIR /app

# Copy the built JAR into the container
COPY build/libs/*.jar app.jar

# Render will provide PORT as env var
EXPOSE 8080

# Run Spring Boot with the JAR
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

