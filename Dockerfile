FROM openjdk:8
EXPOSE 8080
ADD target/book-directory.jar book-directory.jar
ENTRYPOINT ["java","-jar","/book-directory.jar"]