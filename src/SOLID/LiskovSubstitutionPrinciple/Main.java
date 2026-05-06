package SOLID.LiskovSubstitutionPrinciple;

import SOLID.LiskovSubstitutionPrinciple.correto.QuadradoLSP;
import SOLID.LiskovSubstitutionPrinciple.correto.RetanguloLSP;
import SOLID.LiskovSubstitutionPrinciple.errado.Quadrado;

public class Main {
    
    public static void main(String[] args) {
        
        exemploErrado();
        exemploCorreto();
        
        System.out.println("\nExemplo de LSP finalizado!\n");
    }
    
    private static void exemploErrado() {
        
        System.out.println("\n=== EXECUTANDO EXEMPLO (SEM LSP) ===");
        
        Quadrado ret = new Quadrado(); // Substituindo pai pelo filho
        ret.setLargura(10);
        ret.setAltura(5);
        
        // Esperado: 10 * 5 = 50. 
        // Resultado Real: 5 * 5 = 25 (Pois o setAltura sobrescreveu a largura)
        System.out.println("Área esperada para 10x5: 50");
        System.out.println("Área calculada real: " + ret.getArea());
    }
    
    private static void exemploCorreto() {
        
        System.out.println("\n=== EXECUTANDO EXEMPLO (COM LSP) ===");

        RetanguloLSP ret = new RetanguloLSP(10, 5);
        QuadradoLSP quad = new QuadradoLSP(5);

        System.out.println("Área Retângulo: " + ret.getArea());
        System.out.println("Área Quadrado: " + quad.getArea());
    }
}
