FROM java:8
VOLUME /tmp
ADD /target/order-0.0.1-SNAPSHOT.jar order.jar
EXPOSE 8082
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","order.jar"]
