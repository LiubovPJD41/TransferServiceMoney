FROM openjdk:21-slim-bullseye

EXPOSE 5500

COPY target/MoneyTransferService-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar", "MoneyTransferService-0.0.1-SNAPSHOT.jar"]