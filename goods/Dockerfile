FROM java:8
VOLUME /tmp
ADD /target/goods-0.0.1-SNAPSHOT.jar goods.jar
EXPOSE 8081
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","goods.jar"]
