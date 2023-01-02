FROM openjdk:11
EXPOSE 8080
ADD target/devops-github-cicd.jar devops-github-cicd.jar
ENTRYPOINT ["java", "-jar", "/devops-github-cicd.jar"]