#!/bin/bash
echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin
docker build . --tag pgr301-devops --build-arg JAR_FILE=./target/devops-0.0.1-SNAPSHOT.jar
docker tag pgr301-devops kevinberg92/pgr301-devops
docker push kevinberg92/pgr301-devops