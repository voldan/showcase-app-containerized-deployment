FROM openjdk:8-jre-slim

COPY ./repo ./backend
WORKDIR ./backend
RUN chmod a+x ./mvnw

ENTRYPOINT ["sh", "-c", "./mvnw spring-boot:run -f ./server/"]
