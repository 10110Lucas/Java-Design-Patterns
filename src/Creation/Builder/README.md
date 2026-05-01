
# Builder (Padrão de Projeto Criacional)

> Este diretório contém um exemplo prático do padrão **Builder** implementado em Java, baseado nos conceitos do *Refactoring Guru*.

---

## 🎯 Propósito

O **Builder** é um padrão de projeto criacional que permite a **construção de objetos complexos passo a passo**. Diferente de outros padrões de criação, o Builder não exige que os produtos tenham uma interface comum, tornando possível produzir diferentes tipos de objetos usando o mesmo processo de construção.

## 🛠️ O Problema

Imagine um objeto complexo que requer uma inicialização trabalhosa, passo a passo, de muitos campos e objetos aninhados. O construtor desse objeto pode acabar ficando enorme (o chamado *"Telescoping Constructor"*), com uma lista gigante de parâmetros, muitos dos quais podem ser opcionais ou nulos.

## ✅ A Solução

O padrão Builder sugere que você extraia o código de construção do objeto para fora de sua própria classe e o mova para objetos separados chamados **builders**.

Neste exemplo, simulamos a produção de **automóveis** e seus **manuais**:
1.  **Builder**: Interface que define todas as etapas possíveis para configurar um produto.
2.  **Concrete Builders**: Implementam as etapas de construção (ex: `CarBuilder`, `CarManualBuilder`).
3.  **Product**: O objeto complexo sendo construído (ex: `Car`, `Manual`).
4.  **Director**: Classe opcional que define a ordem das etapas de construção para produzir configurações específicas (ex: "Carro Esportivo", "SUV").

## 📂 Estrutura do Exemplo

Abaixo está a organização das classes baseada no exemplo implementado:

*   **`builders/`**: Contém a interface `Builder` e as implementações concretas.
*   **`cars/`**: Define os produtos finais (`Car` e `Manual`).
*   **`components/`**: Peças que compõem o carro (Motor, GPS, Transmissão, etc).
*   **`director/`**: O `Director` que gerencia as receitas de construção.
*   **`main.java`**: Ponto de entrada que demonstra o uso do padrão.

## 🚀 Como identificar?

Você pode reconhecer o padrão Builder em Java quando encontrar:
*   Uma classe com um método de criação e vários métodos para configurar o objeto.
*   Métodos que geralmente suportam **encadeamento** (Fluent Interface), como: 

```java
Car car = builder.setSeats(2)
                 .setEngine(new SportEngine())
                 .setGPS(true)
                 .getResult();
```

---
### 🔗 Referência Técnica
Para mais detalhes teóricos, visite a documentação completa no [Refactoring Guru - Builder em Java](https://refactoring.guru).
