
# S.R.P. - Single Responsibility Principle (Princípio da Responsabilidade Única)

> **Definição:** Uma classe deve ter um, e apenas um, motivo para mudar.

O Princípio da Responsabilidade Única defende que uma classe deve ser especializada em apenas um assunto e possuir apenas uma única responsabilidade dentro do software.

## ❌ O Problema (Sem SRP)
Quando uma classe assume múltiplas responsabilidades (conhecida como God Class), ela se torna rígida. Qualquer alteração em uma regra de negócio pode quebrar outra funcionalidade não relacionada, dificultando a manutenção e os testes automatizados.

## ✅ A Solução (Com SRP)
Dividimos as responsabilidades em classes menores e focadas. No nosso exemplo, separamos a geração do relatório da ação de salvar os dados no banco. Se mudarmos o banco de dados amanhã, a classe de geração de relatório não precisa sofrer nenhuma alteração.

## 🚀 Como Executar
1. Navegue até a pasta do projeto.
2. Execute a classe `Main` do pacote `ruim` para ver o código altamente acoplado.
3. Execute a classe `Main` do pacote `bom` para ver o código desacoplado aplicando o SRP.
