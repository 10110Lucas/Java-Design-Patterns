
# I.S.P. - Interface Segregation Principle (Princípio da Segregação de Interface)

> "Uma classe não deve ser forçada a depender de métodos que não utiliza."

Este princípio trata do "emagrecimento" das interfaces. É melhor ter várias interfaces específicas do que uma interface única e genérica.

## ❌ O Problema (Errado)
Criamos uma interface "Gorda" (Fat Interface) chamada `DispositivoMultifuncional` com métodos para imprimir, escanear e copiar. O problema surge quando temos uma `ImpressoraBasica`: ela é obrigada a implementar o método `escanear()`, mesmo que não possua um scanner, resultando em métodos vazios ou que lançam exceções.

## ✅ A Solução (Correto)
Segregamos (separamos) as responsabilidades em interfaces menores: `Impressora`, `Scanner` e `Copiadora`. Agora, a `ImpressoraBasica` implementa apenas `Impressora`, e uma máquina moderna pode implementar todas elas.

## 🚀 O que observar:
- No exemplo correto, as classes são mais limpas e não carregam "lixo" (métodos que não funcionam).
