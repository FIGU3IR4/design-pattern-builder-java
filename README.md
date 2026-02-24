# Padrão de Projeto Builder em Java: Objeto Pedido

Este projeto demonstra a implementação do Padrão de Projeto Builder em Java, aplicado na criação de um objeto `Pedido`. 

O Builder é um padrão criacional utilizado para construir objetos complexos de forma organizada, legível e flexível.

## Problema Resolvido

Quando uma classe possui:
* Muitos atributos
* Parâmetros opcionais
* Construtores longos
* Dificuldade de leitura

O código pode se tornar confuso, como por exemplo:

```java
Pedido pedido = new Pedido("Victor", "Recife", null, 20.0, null);
Nesse caso:

Não fica claro o significado de cada parâmetro

A ordem pode gerar erros

A manutenção se torna difícil

Solução com Builder
O padrão Builder resolve esse problema separando:

O processo de construção

A representação final do objeto

No projeto, a classe Pedido:

Possui atributos final (imutável)

Tem construtor privado

Contém uma classe estática interna Builder

Estrutura do Código
Classe Pedido
Atributos imutáveis (final)

Construtor privado

Getters para acesso aos dados

Classe Builder
Recebe parâmetros obrigatórios no construtor (cliente, endereco)

Permite configurar parâmetros opcionais (cupom, frete, observacao)

Método build() cria o objeto final

Exemplo de Uso
Java

Pedido pedido = new Pedido.Builder("Victor", "Recife - PE")
        .cupom("DESCONTO10")
        .frete(20.0)
        .observacao("Entregar após as 18h")
        .build();
Esse formato permite:

Código mais legível

Parâmetros nomeados

Flexibilidade na criação

Objeto final imutável

Vantagens do Builder
Evita construtores longos

Melhora a legibilidade

Permite atributos opcionais

Garante imutabilidade

Facilita a manutenção

Conceitos Aplicados
Programação Orientada a Objetos (POO)

Encapsulamento

Imutabilidade

Padrões de Projeto Criacionais

Autor
Victor Figueira
