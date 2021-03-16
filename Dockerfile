# we will use openjdk 8 
FROM openjdk:8
# with alpine as it is a very small linux distro
# -jre-alpine3.9
 
# copy the packaged jar file into our docker image
COPY ./target/devops_scientific_calculator-1.0-SNAPSHOT.jar ./
 
WORKDIR ./
# set the startup command to execute the jar
CMD ["java", "-cp", "devops_scientific_calculator-1.0-SNAPSHOT.jar", "calculator.App"]