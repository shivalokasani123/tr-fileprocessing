FROM java:8
VOLUME /tmp
ADD tr-fileprocessing-0.0.1.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar", "/home/hadoop/test_file.txt"]