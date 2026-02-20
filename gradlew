#!/usr/bin/env bash
# Baixa o Gradle automaticamente se não existir
if [ ! -f "gradle/wrapper/gradle-wrapper.jar" ]; then
    mkdir -p gradle/wrapper
    curl -L https://github.com/gradle/gradle/raw/master/gradle/wrapper/gradle-wrapper.jar -o gradle/wrapper/gradle-wrapper.jar
fi
# Executa o build
java -jar gradle/wrapper/gradle-wrapper.jar assembleDebug
