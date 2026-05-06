package SOLID.InterfaceSegregationPrinciple;

import java.util.Scanner;

import SOLID.InterfaceSegregationPrinciple.correto.IImpressora;
import SOLID.InterfaceSegregationPrinciple.correto.IScanner;
import SOLID.InterfaceSegregationPrinciple.correto.ImpressoraBasicaISP;
import SOLID.InterfaceSegregationPrinciple.correto.SuperImpressoraISP;
import SOLID.InterfaceSegregationPrinciple.errado.ImpressoraBasica;

public class Main {
    
    public static void main(String[] args) {

        exemploErrado();
        exemploCorreto();

        System.out.println("\nExemplo de ISP finalizado!\n");
    }

    private static void exemploErrado() {

        System.out.println("\n=== EXECUTANDO EXEMPLO (SEM ISP) ===");

        try {
            ImpressoraBasica imp = new ImpressoraBasica();
            imp.imprimir();
            imp.escanear(); // Isso vai causar um erro em tempo de execução
        } catch (Exception e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }
    }

    private static void exemploCorreto() {

        System.out.println("\n=== EXECUTANDO EXEMPLO (COM ISP) ===");

        // Criamos um dispositivo de impressão e outro de escaneamento
        ImpressoraBasicaISP simples = new ImpressoraBasicaISP();
        SuperImpressoraISP completa = new SuperImpressoraISP();

        simples.imprimir();
        
        completa.imprimir();
        completa.escanear();
        
        System.out.println("Classes implementam apenas o que realmente utilizam.");
    }
}
