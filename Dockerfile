# Use Java 21 (this fixes your issue!)
FROM eclipse-temurin:21-jdk AS builder

WORKDIR /app

# Copy Gradle files
COPY gradle/ gradle/
COPY gradlew build.gradle settings.gradle ./

# Make gradlew executable
RUN chmod +x ./gradlew

# Copy source code
COPY src/ src/

# Set memory options and build
ENV GRADLE_OPTS="-Xmx2g -XX:MaxMetaspaceSize=512m"
RUN ./gradlew bootJar -x test --no-daemon --stacktrace

# Stage 2: Run the app with Java 21 JRE
FROM eclipse-temurin:21-jre

WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

