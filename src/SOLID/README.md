
# Estudo de Princípios SOLID com Java

Este repositório foi criado para documentar meus estudos sobre os princípios **SOLID**, aplicados à programação orientada a objetos com Java. O objetivo é demonstrar a diferença entre códigos acoplados (errado) e códigos limpos/escaláveis (correto).

## O que é SOLID?
SOLID é um acrônimo para cinco princípios de design de software que facilitam a compreensão, o desenvolvimento e a manutenção de sistemas.


| Sigla | Princípio | Descrição Simples |
| :--- | :--- | :--- |
| **S** | [SRP](./SingleResponsabilityPrinciple) | Uma classe deve ter apenas um motivo para mudar. |
| **O** | [OCP](./OpenClosedPrinciple) | Aberto para extensão, mas fechado para modificação. |
| **L** | [LSP](./LiskovSubstitutionPrinciple) | Subclasses devem ser substituíveis por suas classes base. |
| **I** | [ISP](./InterfaceSegregationPrinciple) | Muitas interfaces específicas são melhores que uma geral. |
| **D** | [DIP](./DependencyInversionPrinciple) | Dependa de abstrações, não de implementações concretas. |

---

## Estrutura do Repositório

Cada pasta representa um princípio e contém:
1.  **`errado/`**: Exemplo de código que viola o princípio.
2.  **`correto/`**: O mesmo código refatorado aplicando o princípio.
3.  **`Main.java`**: Classe central para executar e comparar ambos os cenários no console.
4.  **`README.md`**: Explicação teórica detalhada do princípio.

## Como Executar

Para rodar os exemplos, certifique-se de ter o **JDK 8+** instalado.

- Escolha o princípio que deseja estudar e execute a classe `Main` dentro de sua respectiva pasta.

