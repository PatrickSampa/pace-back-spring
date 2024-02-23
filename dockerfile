# Use uma imagem Java como base
FROM openjdk:17-alpine

# Defina o diretório de trabalho como /app
WORKDIR /app

# Copie o arquivo jar para o diretório de trabalho
COPY target/gestao-escala-backend-0.0.1-SNAPSHOT.jar /app/gestao-escala-backend-0.0.1-SNAPSHOT.jar

# Execute o aplicativo
CMD ["java", "-jar", "gestao-escala-backend-0.0.1-SNAPSHOT.jar"]