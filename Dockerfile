FROM openjdk:8 
EXPOSE 8080
ADD /build/libs/aws-test-springboot.jar aws-test-springboot.jar
ENTRYPOINT ["java","-jar","aws-test-springboot.jar"]


