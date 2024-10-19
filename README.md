# TU-Java

<p align="center">
  <img src="https://github.com/luizleme-tech/tu-java/blob/main/logo-tu-java.png" align="center" style="border-radius: 50%; display: block; margin: auto;" width="35%" >
</p>

[![Java Version](https://img.shields.io/badge/Java-17-blue)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.2-brightgreen)](https://spring.io/projects/spring-boot)
[![License](https://img.shields.io/github/license/luizleme-tech/tu-java)](LICENSE)

## Índice
- [Descrição do Projeto](#descrição-do-projeto)
- [Status do Projeto](#status-do-projeto)
- [Tipos de Testes Implementados](#tipos-de-testes-implementados)
- [Acesso ao Projeto](#acesso-ao-projeto)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Estrutura de Branches](#estrutura-de-branches)
- [Pessoas Contribuidoras](#pessoas-contribuidoras)
- [Pessoas Desenvolvedoras do Projeto](#pessoas-desenvolvedoras-do-projeto)
- [Licença](#licença)

## Descrição do Projeto
O projeto **TU-Java** é uma aplicação desenvolvida em Java com Spring Boot que demonstra várias abordagens de testes em projetos Java. Cada branch do repositório explora um tipo específico de teste, incluindo testes unitários, integração e de contrato. A branch principal dedicada ao Spring Boot integra todas essas abordagens, proporcionando uma visão abrangente das práticas de teste em um projeto real.

## Status do Projeto
✅ Projeto finalizado.

## Tipos de Testes Implementados
- **Testes fluentes com AssertJ:** Implementação de testes com uma API fluente, garantindo maior legibilidade e verificações avançadas.
- **Testes parametrizados:** Executa o mesmo teste com diferentes entradas, facilitando a verificação de múltiplos cenários.
- **Testes com mocks:** Utiliza Mockito para criar mocks e simular o comportamento de dependências, permitindo testes isolados.
- **Cobertura de testes com JaCoCo:** Mede a cobertura de código dos testes, garantindo que o código da aplicação esteja bem testado.
- **Testes com Spring Boot:** Integra todas as abordagens de testes (fluent, parametrizado, mocks e cobertura) dentro do ecossistema Spring Boot.

## Acesso ao Projeto
Você pode acessar o projeto diretamente [aqui](https://github.com/luizleme-tech/tu-java) ou clonar o repositório para explorar o código localmente:

```bash
git clone https://github.com/luizleme-tech/tu-java.git
```

## Tecnologias Utilizadas

- Java 17 - Linguagem de programação principal.
- Spring Boot 3.2.2 - Framework para desenvolvimento da aplicação.
- Resilience4J - Biblioteca para Circuit Breaker e Retry.
- PostgreSQL - Banco de dados em produção.
- H2 Database - Banco de dados em memória para testes.
- JUnit 5 - Framework de testes unitários e de integração.
- Mockito - Biblioteca para mocks em testes unitários.
- Testcontainers - Suporte para testes com dependências de containers.
- Lombok - Para redução de verbosidade do código.

## Estrutura de Branches

- **main:** Contém a versão inicial do estudo de testes.
- **testes-fluentes-com-assertJ:** Abordagem focada em testes fluentes com AssertJ.
- **testes-parametrizados:** Abordagem focada em testes parametrizados.
- **teste-com-mocks:** Implementação de testes utilizando mocks com Mockito.
- **cobertura-de-testes-jacoco:** Implementação de cobertura de testes com JaCoCo.
- **testes-spring-boot:** Integra todas as abordagens de testes anteriores, incluindo testes Spring Boot.

## Pessoas Contribuidoras

Se você deseja contribuir, por favor, faça um fork do projeto e abra um Pull Request. Estamos abertos a melhorias e novas funcionalidades!

## Pessoas Desenvolvedoras do Projeto

| [<img loading="lazy" src="https://avatars.githubusercontent.com/u/160872945?v=4" width=115><br><sub>Luiz Henrique Leme</sub>](https://github.com/luizleme-tech) | 
| :---: | 

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.

