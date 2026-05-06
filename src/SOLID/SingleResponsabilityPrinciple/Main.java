package SOLID.SingleResponsabilityPrinciple;

import SOLID.SingleResponsabilityPrinciple.correto.RelatorioRepository;
import SOLID.SingleResponsabilityPrinciple.correto.RelatorioSRP;
import SOLID.SingleResponsabilityPrinciple.errado.Relatorio;

public class Main {
    
    public static void main(String[] args) {
        
        exemploErrado();

        exemploCorreto();

        System.out.println("\nExemplo de SRP finalizado!\n");
    }

    private static void exemploErrado() {

        System.out.println("\n=== EXECUTANDO EXEMPLO (SEM SRP) ===");

        Relatorio relatorio = new Relatorio();
        relatorio.gerarRelatorio();
        
        // A própria classe executa a persistência
        relatorio.salvarNoBanco();
    }

    private static void exemploCorreto() {

        System.out.println("\n=== EXECUTANDO EXEMPLO (COM SRP) ===");

        // 1. Criamos e geramos o relatório
        RelatorioSRP relatorio = new RelatorioSRP();
        relatorio.gerarRelatorio();

        // 2. Criamos o repositório responsável por salvar
        RelatorioRepository repository = new RelatorioRepository();

        // 3. Delegamos a gravação para quem realmente sabe gravar
        repository.salvarNoBanco(relatorio);
    }
}
