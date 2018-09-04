# SIENGE

### Tecnologias Utilizadas

1. Java 8
2. Spring Boot 2
3. Bootstrap
4. JQuery
5. Maven

### Estrutura do Projeto

```
sienge
├── src
|   |── main
|       ├── resources
|       └── java
└── pom.xml
```

### Preparação do Ambiente

1. [Instalar JDK 8](http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)
2. [Instalar Maven 3.5.0](http://maven.apache.org/docs/3.5.0/release-notes.html)
5. [Instalar Git](https://git-scm.com/downloads)

### Preparação do SIENGE

1. `git clone https://github.com/dudulive/sienge.git`

### Como executar?

1. `mvn spring-boot:run`
3. Acessar `http://localhost:8080`

### Como gerar o pacate para publicação (deploy)?

1. `mvn package`
3. `cd ./target`
4. `java -jar ${artifactId}.jar`

### Como acessar a aplicação?

[http://{host}:8080/](http://localhost:8080/)
