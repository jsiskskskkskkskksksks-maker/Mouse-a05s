#!/usr/bin/env bash
# Baixa o Gradle de forma oficial e segura
mkdir -p gradle/wrapper
printf "distributionUrl=https\://services.gradle.org/distributions/gradle-8.0-bin.zip\nwrapperVersion=8.0" > gradle/wrapper/gradle-wrapper.properties

# Usa o próprio Gradle para se auto-instalar e compilar
curl -sL https://raw.githubusercontent.com/gradle/gradle/master/gradlew -o gradlew
chmod +x gradlew
./gradlew assembleDebug
