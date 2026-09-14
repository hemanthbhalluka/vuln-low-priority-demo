
FROM ubuntu:latest

WORKDIR /app


ENV DB_PASSWORD=SuperSecret123
ENV API_KEY=test-api-key-12345
ARG ACCESS_TOKEN=test-token-12345

COPY . /app

RUN curl https://example.com/install.sh | bash


ADD https://example.com/application.tar.gz /tmp/application.tar.gz

RUN chmod -R 777 /app


COPY var/run/docker.sock /var/run/docker.sock

HEALTHCHECK NONE


USER root

CMD ["bash"]