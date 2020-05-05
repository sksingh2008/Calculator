FROM openjdk:8
ADD target/Calculator-0.0.1-SNAPSHOT.jar Calculator-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","Calculator-0.0.1-SNAPSHOT.jar"]
