
# O.C.P. - Open/Closed Principle (Princípio Aberto/Fechado)

> "Entidades de software devem estar abertas para extensão, mas fechadas para modificação."

O OCP defende que o comportamento de um sistema pode ser estendido sem que precisemos alterar o código-fonte original já existente.

## ❌ O Problema (Errado)
Quando queremos adicionar uma nova funcionalidade (ex: um novo tipo de desconto ou uma nova forma de envio), somos forçados a abrir uma classe que já funciona e adicionar blocos de `if/else` ou `switch`. Isso aumenta o risco de introduzir bugs em funcionalidades antigas.

## ✅ A Solução (Correto)
Utilizamos **Abstrações** (Interfaces ou Classes Abstratas). Em vez de a classe principal conhecer as implementações, ela conhece apenas o "contrato". Para adicionar um novo comportamento, basta criar uma nova classe que implementa essa interface.

## 🚀 O que observar no código:
- Note como no exemplo correto, se quisermos adicionar um terceiro tipo de desconto, não mexemos na classe `CalculadoraDeDesconto`.
