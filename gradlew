#!/usr/bin/env bash
# Baixa o lançador oficial do Gradle
curl -sL https://raw.githubusercontent.com/gradle/gradle/v8.0.0/gradlew -o gradlew
chmod +x gradlew

# Cria o arquivo de configuração de versão automaticamente
mkdir -p gradle/wrapper
echo "distributionUrl=https\://services.gradle.org/distributions/gradle-8.0-bin.zip" > gradle/wrapper/gradle-wrapper.properties

# Inicia a compilação
./gradlew assembleDebug
