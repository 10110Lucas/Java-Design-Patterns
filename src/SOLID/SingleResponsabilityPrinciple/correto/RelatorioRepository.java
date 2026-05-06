package SOLID.SingleResponsabilityPrinciple.correto;

public class RelatorioRepository {
    
    public void salvarNoBanco(RelatorioSRP relatorio) {

        if (relatorio == null || relatorio.getConteudo() == null) {
            System.out.println("Erro: Relatório vazio não pode ser salvo.");
            return;
        }
        System.out.println("Conectando ao MySQL...");
        System.out.println("Salvando no banco: " + relatorio.getConteudo());
    }
}
