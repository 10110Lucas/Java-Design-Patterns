
# L.S.P. - Liskov Substitution Principle (Princípio da Substituição de Liskov)

> "Classes derivadas devem poder ser substituídas por suas classes base sem quebrar o comportamento do sistema."

Este princípio diz que, se a classe `B` é uma subclasse de `A`, então devemos ser capazes de substituir `A` por `B` sem que o programa se comporte de forma inesperada.

## ❌ O Problema (Errado)
O erro clássico acontece quando usamos herança apenas para reaproveitar código, mesmo quando o comportamento não é compatível. No exemplo, forçamos um `Quadrado` a ser um `Retangulo`. Como o quadrado exige que os lados sejam iguais, ele acaba alterando a altura quando mudamos a largura, o que quebra a expectativa de quem usa a classe pai `Retangulo`.

## ✅ A Solução (Correto)
Em vez de herança forçada, usamos **Abstração**. Criamos uma interface comum `Forma` que foca no que ambas fazem (calcular área), mas sem impor regras de um para o outro. Assim, garantimos que cada classe se comporte conforme sua própria natureza.

## 🚀 O que observar:
- No exemplo errado, um método que espera um retângulo terá um resultado de área bizarro se receber um quadrado.
