Descrição

A MovieRate API é um serviço RESTful que fornece informações sobre a avaliação de filmes. A API utiliza Feign Clients para se comunicar com serviços externos e implementa o padrão Circuit Breaker utilizando Resilience4j para garantir resiliência em suas operações.
Tecnologias Utilizadas

    Java 
    Spring Boot 3.x
    Spring Cloud OpenFeign
    Resilience4j Circuit Breaker
    Maven

Funcionalidades

    Demonstrar a utilização do circuitBreaker em uma API que permite consultar a nota de filmes usando um identificador único.
    Circuit Breaker: Implementado com Resilience4j, o Circuit Breaker protege a API contra falhas temporárias ao se comunicar com serviços externos.
    Fallback: Em caso de falhas nos serviços externos, a API retorna uma resposta padrão definida pelo método de fallback.