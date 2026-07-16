FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app 
COPY target/Student_Restfull_API-0.0.1-SNAPSHOT.jar myapp.jar
EXPOSE 6060 
ENTRYPOINT ["java","-jar","myapp.jar"]

