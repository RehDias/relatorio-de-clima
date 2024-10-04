# Relatório de Clima 🌦️

Este projeto foi desenvolvido com o objetivo de gerar relatórios do clima atual de uma cidade fornecida pelo usuário através do terminal. Utilizando o framework Spring, foi aplicada a técnica de Injeção de Dependência e integrada uma API externa para obter as informações meteorológicas.

## 📋 Funcionalidades

1. **Consulta do Clima Atual:** O usuário informa o nome de uma cidade no terminal, e o sistema retorna o clima atual dessa localidade.
2. **Uso de API Externa:** Utiliza uma API externa para obter os dados atualizados do clima em tempo real.

## 📝 Objetivos do Projeto

Este projeto tem como foco principal o estudo de injeção de dependência com o **Spring Framework**, além de práticas comuns no desenvolvimento de aplicações RESTful:

- Implementação de endpoints RESTful utilizando o **Spring**.
- Criação de **DTOs** (Data Transfer Objects) para transferência de dados.
  
## 🧠 Habilidades Desenvolvidas

As seguintes habilidades foram trabalhadas durante o desenvolvimento deste projeto:

- Implementação de injeção de dependência utilizando o **Spring Framework**.
- Utilização de **DTOs** para transferir dados de maneira eficiente entre as camadas da aplicação.
- Integração com API externa para obtenção de dados climáticos.
- Implementação de camada de serviço para centralizar e encapsular a lógica de negócio.

## 🚀 Como Executar o Projeto

### Pré-requisitos
- [Java JDK 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Spring Boot](https://spring.io/projects/spring-boot)
- Conexão com a Internet (para acessar a API externa de clima)

### Passos para Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/relatorio-clima.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd relatorio-clima
   ```

3. Compile e execute o projeto:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Informe a cidade desejada no terminal para gerar o relatório climático.

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Spring Boot**: Framework para criar a aplicação web e gerenciar a injeção de dependência.
- **API Externa de Clima**: Integração com uma API para obter dados do clima.
- **DTOs**: Utilizados para transferência de dados entre as camadas da aplicação.

## 🏆 Conclusão

O projeto permitiu uma sólida compreensão das técnicas de injeção de dependência com o **Spring Framework** e a integração com APIs externas. Além disso, demonstrou como estruturar uma aplicação RESTful, utilizando DTOs e serviços para gerenciar a lógica de negócio.
