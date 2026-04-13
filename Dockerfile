# Use Java runtime
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy jar file
COPY target/maven-1.0-SNAPSHOT.jar app.jar

# Run application
CMD ["java", "-jar", "app.jar"]