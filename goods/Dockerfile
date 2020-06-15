FROM java:8
VOLUME /tmp
ADD goods-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT [ "java", "-jar", "/app.jar" ]
