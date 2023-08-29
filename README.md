# Trabalho 6 de Construção de Compiladores

 ## Integrantes
  
- Bruno Leandro Pereira - 790167

- Bruno Luis Rodrigues Medri - 790004

- Thiago Roberto Garcia Albino - 790034

## Sobre a linguagem

A linguagem Treino auxilia na montagem da lista de exercicios para treinar, separando os exercicios pelos seus grupos musculares: peito, triceps, costas, biceps, pernas, ombros, onde cada grupo tem os respectivos nomes dos exercicios, seguidos da quantidade de series e repetições.

**Como utilizar**

Para utilizar a linguagem Treino temos que iniciar a nossa lista utilizando a palavra-chave treino. Logo após, temos que adicionar todos os grupos musculares, na seguinte ordem: peito, triceps, costas, biceps, pernas, ombros, onde cada grupo tem os respectivos nomes dos exercicios, seguidos da quantidade de series e repetições, no seguinte modelo: "exercicio", "Nº Séries" - "Nº Repetições".

**Exemplo Simples:**
```
treino
    peito
        supino inclinado, 4 - 12
    triceps
        corda, 4 - 12
    costas
        remada baixa, 4 - 12
    biceps
        rosca alternada, 3 - 15
    pernas
        leg press, 4 - 15
    ombros
        elevacao lateral, 3 - 15
```

## Requisitos prévios
Estes são os requisitos para execução e compilação do projeto: **Java 11** e **Maven**.

## Comandos necessários

Para compilar e executar este programa, primeiro você deve entrar na pasta chamada `academia`. Em seguida execute os comandos abaixo no terminal:

```
  mvn package
```
```
  java -jar target/LA-semantico-1.0-SNAPSHOT-jar-with-dependencies.jar [caminho para arquivo de entrada] [caminho para o arquivo de saída]
  Ex: java -jar target/academia-1.0-SNAPSHOT-jar-with-dependencies.jar ../entrada.txt ../saida
```

Após a execução será gerado o arquivo de saida e também um arquivo em PDF com a lista de treino formatada.
