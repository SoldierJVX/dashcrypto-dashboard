# dashcrypto-dashboard

## Implementação do Desafio Full-Stack Developer da QR Capital
https://github.com/qrcapital/desafios/blob/main/desafio-developer.md

Até o momento foi feito os serviços base do backend usando o design de microserviços do Spring com todos eles funcionais porém somente a busca de lista de cryptos
está sendo usada pelo front (Os outros serviços não ficaram prontos).

Front tem a tela inicial, a tela de login(sem login, só clicar no botão para acessar o dashboard) e o dashboard com o campo de busca com autocomplete buscando os dados do backend e da API.

 - Links dos repositórios:
```
https://github.com/SoldierJVX/dashcrypto-config-server
https://github.com/SoldierJVX/dashcrypto-service-discovery
https://github.com/SoldierJVX/dashcrypto-gateway
https://github.com/SoldierJVX/dashcrypto-dashboard
https://github.com/SoldierJVX/dashcrypto-login
https://github.com/SoldierJVX/dashcrypto-config
https://github.com/SoldierJVX/dashcrypto-front
```

### Itens Necessários

 - Docker
 - Java 17
 - Nodejs 16.14.2
 - Yarn
 - lite-server

### Configuração do Docker

#### Zipkin

 - Rode:
```
docker run --name zipkin -d -p 9411:9411 openzipkin/zipkin
```

#### Mysql
- Rode:
```
docker run --name mysql -e MYSQL_ROOT_PASSWORD=master -p 3306:3306 -d mysql:latest
```

- Crie a database:
```
create database dashcrypto_login;
```

### Subindo Aplicação

#### Backend

 - Baixe os jars da aplicação:

```
https://github.com/SoldierJVX/dashcrypto-config-server/releases/tag/desafio-developer
https://github.com/SoldierJVX/dashcrypto-service-discovery/releases/tag/desafio-developer
https://github.com/SoldierJVX/dashcrypto-gateway/releases/tag/desafio-developer
https://github.com/SoldierJVX/dashcrypto-dashboard/releases/tag/desafio-developer
https://github.com/SoldierJVX/dashcrypto-login/releases/tag/desafio-developer
```
 - Execute eles na mesma ordem acima com o comando:

```
java -jar .\<nome-do-jar>.jar
```


 - Ou baixe os projetos e execute na mesma ordem acima.

#### Frontend

Baixe o 7z em:
```
https://github.com/SoldierJVX/dashcrypto-front/releases/tag/desafio-developer
```
Descompacte.

[Necessário Node e Yarn]\
Instale um web server (como lite-server - https://github.com/johnpapa/lite-server), e rode na pasta raiz do front. Comando:
```
npx lite-server
```
