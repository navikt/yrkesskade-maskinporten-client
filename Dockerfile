FROM navikt/java:16-appdynamics

ENV APPLICATION_NAME=yrkesskade-maskinporten-client
ENV APPD_ENABLED=TRUE
ENV JAVA_OPTS="-Dhttps.protocols=TLSv1,TLSv1.1,TLSv1.2"

COPY ./target/yrkesskade-maskinporten-client-1.0.0-SNAPSHOT.jar "app.jar"