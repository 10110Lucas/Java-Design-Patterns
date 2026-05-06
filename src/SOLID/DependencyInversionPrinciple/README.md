
# D.I.P. - Dependency Inversion Principle (Princípio da Inversão de Dependência)

> "Dependa de abstrações, não de implementações concretas."

O DIP afirma que módulos de alto nível (a lógica de negócio) não devem depender de módulos de baixo nível (detalhes como banco de dados ou APIs). Ambos devem depender de abstrações.

## ❌ O Problema (Errado)
A classe de negócio `Interruptor` cria diretamente um objeto `Lampada`. Isso cria um acoplamento rígido: o interruptor só serve para lâmpadas. Se quisermos que o interruptor ligue um `Ventilador`, teremos que modificar a classe `Interruptor`, violando também o OCP.

## ✅ A Solução (Correto)
Criamos uma interface `Dispositivo`. O `Interruptor` agora depende apenas dessa interface. Não importa o que está sendo ligado, desde que siga o contrato de `ligar()` e `desligar()`. Invertemos a dependência: os detalhes agora dependem da abstração da lógica.

## 🚀 O que observar:
- No exemplo correto, o `Interruptor` é universal. Ele liga qualquer coisa que implemente a interface `Dispositivo`.
