package SOLID.SingleResponsabilityPrinciple.errado;

public class Relatorio {
    
    private String conteudo;

    public void gerarRelatorio() {
        
        System.out.println("Gerando relatório de vendas...");
        this.conteudo = "Conteúdo altamente confidencial do relatório de vendas.";
    }

    // VIOLAÇÃO DO SRP: O relatório não deveria saber como se conectar ou salvar no banco
    public void salvarNoBanco() {

        if (this.conteudo == null) {
            System.out.println("Erro: Não há conteúdo para salvar.");
            return;
        }
        System.out.println("Conectando ao MySQL...");
        System.out.println("Salvando no banco: " + this.conteudo);
    }
}
