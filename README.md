# Tarefa - Reflections

Leitura de anotação `@Tabela` em tempo de execução usando Reflection.

## Objetivo

Utilizar o mecanismo de **Reflection** do Java para ler o valor da anotação `@Tabela` criada no exercício anterior e imprimir o nome da tabela no console.

## O que é Reflection?

Reflection é uma API do Java que permite inspecionar classes, métodos, campos e anotações em **tempo de execução**, sem saber os detalhes em tempo de compilação.

## Código principal

java
// Usando Reflection para ler a anotação
Class<?> classe = Usuario.class;

if (classe.isAnnotationPresent(Tabela.class)) {
    Tabela tabela = classe.getAnnotation(Tabela.class);
    String nomeTabela = tabela.nome();
    System.out.println("Nome da tabela: " + nomeTabela);
}
