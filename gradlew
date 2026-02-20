#!/usr/bin/env bash
# Baixa o Gradle automaticamente se não existir
if [ ! -f "gradle/wrapper/gradle-wrapper.jar" ]; then
    mkdir -p gradle/wrapper
    curl -L https://github.com/gradle/gradle/raw/master/gradle/wrapper/gradle-wrapper.jar -o gradle/wrapper/gradle-wrapper.jar
fi
# Executa o build
java -jar gradle/wrapper/gradle-wrapper.jar assembleDebug
#!/usr/bin/env bash
mkdir -p gradle/wrapper
curl -L https://github.com/gradle/gradle/raw/v8.0.0/gradle/wrapper/gradle-wrapper.jar -o gradle/wrapper/gradle-wrapper.jar
echo "distributionUrl=https\://services.gradle.org/distributions/gradle-8.0-bin.zip" > gradle/wrapper/gradle-wrapper.properties
java -jar gradle/wrapper/gradle-wrapper.jar assembleDebug
