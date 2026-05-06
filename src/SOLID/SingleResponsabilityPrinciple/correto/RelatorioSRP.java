package SOLID.SingleResponsabilityPrinciple.correto;

public class RelatorioSRP {
    
    private String conteudo;

    public void gerarRelatorio() {
        
        System.out.println("Gerando relatório de vendas...");
        this.conteudo = "Conteúdo altamente confidencial do relatório de vendas.";
    }

    public String getConteudo() {
        return conteudo;
    }
}
