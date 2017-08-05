# Swagger and Asciidoctor with Spring Boot Demo

## Generate user guide

Run the following command to generate the user guide from the Asciidoc files: 

```
mvn clean package
``` 

The generated documentation can be found under the `target/generated-docs` directory.

## Run the project and view swagger

```
mvn spring-boot:run
```

And navigate to [http://localhost:8080/swagger-ui.html]()