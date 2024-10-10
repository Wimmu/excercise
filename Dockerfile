FROM maven:latest
LABEL authors="wimmu"
WORKDIR /app
COPY pom.xml /app/
COPY . /app/
RUN mvn package
CMD ["java", "-jar", "target/TempConverter_WilmaIsberg-1.0-SNAPSHOT.jar"]