# Stage 1: Build the JAR with Gradle
FROM gradle:8.7-jdk17 AS builder
WORKDIR /app

# Copy Gradle files
COPY build.gradle settings.gradle ./
COPY gradle gradle
COPY gradlew ./
RUN chmod +x gradlew

# Download dependencies first (for caching)
RUN ./gradlew dependencies --no-daemon || true

# Copy project source
COPY . .

# Build the Spring Boot app (skip tests for faster builds)
RUN ./gradlew bootJar -x test --no-daemon

# Stage 2: Run the app
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# Copy the jar from the builder stage
COPY --from=builder /app/build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]

