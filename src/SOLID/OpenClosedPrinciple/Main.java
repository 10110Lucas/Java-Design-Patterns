package SOLID.OpenClosedPrinciple;

import SOLID.OpenClosedPrinciple.errado.CalculadoraDeDesconto;
import SOLID.OpenClosedPrinciple.correto.*;

public class Main {
    
    public static void main(String[] args) {

        exemploErrado();
        exemploCorreto();

        System.out.println("\nExemplo de OCP finalizado!\n");
    }

    private static void exemploErrado() {

        System.out.println("\n=== EXECUTANDO EXEMPLO (SEM OCP) ===");
        CalculadoraDeDesconto calc = new CalculadoraDeDesconto();
        
        System.out.println("Desconto Estudante: " + calc.aplicarDesconto(100, "ESTUDANTE"));
        System.out.println("Desconto VIP: " + calc.aplicarDesconto(100, "VIP"));
    }

    private static void exemploCorreto() {

        System.out.println("\n=== EXECUTANDO EXEMPLO (COM OCP) ===");
        CalculadoraDeDescontoOCP calc = new CalculadoraDeDescontoOCP();

        Desconto descontoEstudante = new DescontoEstudante();
        Desconto descontoVip = new DescontoVip();

        System.out.println("Desconto Estudante: " + calc.calcular(100, descontoEstudante));
        System.out.println("Desconto VIP: " + calc.calcular(100, descontoVip));
    }
}
