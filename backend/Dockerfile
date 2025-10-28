# 1. Comece com uma imagem base que tenha Java
FROM openjdk:17-alpine

# 2. Crie uma pasta de trabalho dentro da imagem
WORKDIR /app

# 3. Copie o seu "produto final" (o arquivo .jar) para dentro da imagem
#    (Veja a observação abaixo!)
COPY ./target/meu-app-0.0.1.jar app.jar

# 4. Diga ao Docker qual comando rodar para iniciar sua API
CMD ["java", "-jar", "app.jar"]