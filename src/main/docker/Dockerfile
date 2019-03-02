FROM openjdk:8-jre-alpine3.9

COPY droplogs-0.0.1-SNAPSHOT.jar /app.jar
COPY entrypoint.sh /entrypoint.sh
RUN chmod a+x /entrypoint.sh

ENTRYPOINT /entrypoint.sh

