# Decorator Pattern (Padrão Decorador)

> "Anexa responsabilidades adicionais a um objeto dinamicamente. Os decoradores fornecem uma alternativa flexível à subclasse para estender a funcionalidade."

O padrão **Decorator** funciona como uma "boneca russa" (Matryoshka) ou como as camadas de uma cebola: você coloca um objeto dentro de outro, e cada "camada" adiciona um comportamento novo.

## ❌ O Problema
Imagine que você tem uma classe que grava dados em um arquivo. Agora você quer que ela também **criptografe** os dados. Depois, quer que ela **compacte** os dados. Se usássemos herança, teríamos que criar:
- `ArquivoComCriptografia`
- `ArquivoComCompactacao`
- `ArquivoComCriptografiaECompactacao` (aqui começa a confusão...)

A herança cria uma explosão de classes e é estática (você não pode mudar o comportamento em tempo de execução).

## ✅ A Solução
Criamos **Wrappers** (envoltórios). Todos os objetos (o principal e os decoradores) implementam a mesma interface. Assim, um decorador pode envolver o objeto real ou outro decorador, empilhando funcionalidades:
1. O objeto base grava o arquivo.
2. O decorador de criptografia envolve o base, encripta o texto e manda o base gravar.
3. O decorador de compactação envolve o de criptografia, compacta tudo e passa para frente.

## 🚀 O que observar no código:
- **Interface Comum:** `DataSource` define o que todos fazem (ler e escrever).
- **Componente Base:** `FileDataSource` é quem realmente faz o trabalho "pesado" no disco.
- **Decorador Base:** `DataSourceDecorator` contém o objeto envolvido e delega o trabalho para ele.
- **Decoradores Concretos:** `EncryptionDecorator` e `CompressionDecorator` adicionam a lógica extra antes ou depois de passar o trabalho para o próximo da fila.

## 💡 Exemplo de Uso (Código Cliente)
```java
// Criamos uma pilha: Compactação -> Criptografia -> Arquivo Real
DataSource decorado = new CompressionDecorator(
                          new EncryptionDecorator(
                              new FileDataSource("dados.txt")));

// Ao chamar writeData, ele passará por todas as camadas automaticamente!
decorado.writeData("Conteúdo Sensível");
```

---
*Baseado nos exemplos do [Refactoring Guru](https://refactoring.guru/pt-br/design-patterns/decorator/java/example).*
