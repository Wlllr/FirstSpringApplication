# Use uma imagem com JDK
FROM openjdk:17-jdk-slim
# Adiciona o arquivo JAR
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar
# Expõe a porta (ajuste conforme necessário)
EXPOSE 8080
# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
