FROM eclipse-temurin:17-jdk
WORKDIR /app

# .jar faylını layihədən image-ə kopyalayırıq
COPY build/libs/users-ms-0.0.1-SNAPSHOT.jar app.jar

# Tətbiqi start edirik
ENTRYPOINT ["java", "-jar", "app.jar"]
