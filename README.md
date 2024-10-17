# tu-java

Este repositório contem um projeto de estudo de testes unitários em Java e com Spring Boot

---

## Executando o Jacoco no projeto

Executar pelo console os comandos:

1. Pelo console executar o comando

```
mvn clean test
```

2. Gerando o realtorio do Jacoco

```
mvn jacoco:report
```

---


## Executando o TestContainer no projeto

Para executar a classe de testes UserRepositoryContainerTest

será necessário ter o Docker instalado na máquina.

Antes de executar o teste, se for no Windows iniciar o Docker Desktop e executar os testes.


---


## OBSERVAÇÃO


#### Teste de Segurança

Para a implementação dos testes de segurança, foi necessário utilizar o starter do spring security, contudo isso afetou os testes de controller e o que teste o controller integrado.

Sendo assim foi criada um configuração que desabilita a segurança e foi usada em duas classes de testes de controller para não interferir o teste de segurança.
