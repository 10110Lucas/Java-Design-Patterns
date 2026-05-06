package SOLID.DependencyInversionPrinciple;

import SOLID.DependencyInversionPrinciple.correto.IDispositivo;
import SOLID.DependencyInversionPrinciple.correto.InterruptorDIP;
import SOLID.DependencyInversionPrinciple.correto.LampadaDIP;
import SOLID.DependencyInversionPrinciple.correto.VentiladorDIP;
import SOLID.DependencyInversionPrinciple.errado.Interruptor;

public class Main {
    
    public static void main(String[] args) {
        
        exemploErrado();
        exemploCorreto();

        System.out.println("\nExemplo de DIP finalizado!\n");
    }
    
    private static void exemploErrado() {
        System.out.println("\n=== EXECUTANDO EXEMPLO (SEM DIP) ===");
        
        Interruptor interruptor = new Interruptor();
        
        // O interruptor aciona a lâmpada diretamente, criando uma forte dependência.
        interruptor.acionar(); 

        System.out.println("Nota: Este interruptor só liga lâmpadas.");
    }
    
    private static void exemploCorreto() {
        System.out.println("\n=== EXECUTANDO EXEMPLO (COM DIP) ===");
        
        // Criamos um dispositivo (pode ser uma lâmpada, ventilador, etc.)
        IDispositivo lampada = new LampadaDIP();
        
        // Criamos o interruptor, mas agora ele depende da abstração (interface), não da implementação concreta.
        InterruptorDIP int1 = new InterruptorDIP(lampada); // Podemos plugar uma Lâmpada
        
        // Acionamos o interruptor, que por sua vez aciona o dispositivo sem saber detalhes de como ele funciona.
        int1.acionar();

        // Ou podemos plugar um Ventilador SEM mudar a classe Interruptor
        VentiladorDIP ventilador = new VentiladorDIP();
        InterruptorDIP int2 = new InterruptorDIP(ventilador);
        int2.acionar();
    }
}
