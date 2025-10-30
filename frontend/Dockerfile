# ----- ESTÁGIO 1: O "Build" (A Fábrica com Node.js) -----
# Começamos com uma imagem que tem Node.js instalado
FROM node:18-alpine AS builder

# Define o diretório de trabalho dentro da imagem
WORKDIR /app

# Copia o "mapa" do projeto (package.json)
# (Usamos a mesma otimização de cache que aprendemos para o Maven!)
COPY package.json package-lock.json ./

# Instala todas as dependências (React, etc.)
RUN npm install

# Copia todo o resto do código-fonte (src/, public/, etc.)
COPY . .

# Roda o comando de "compilação"
# Isso cria a pasta /app/build/ com nosso site final
RUN npm run build

# ----- ESTÁGIO 2: O "Serve" (O Produto Final com Nginx) -----
# Começamos uma imagem NOVA e limpa, com Nginx
FROM nginx:alpine

# O que fazer agora? O resultado do Estágio 1 está na pasta /app/build/
# Vamos copiar ESSE resultado para a pasta do Nginx.

# Copia os arquivos da pasta /app/build/ (do estágio 'builder')
# para a pasta padrão do Nginx.
COPY --from=builder /app/build /usr/share/nginx/html

# (O Nginx já sabe como iniciar, então não precisamos de CMD)