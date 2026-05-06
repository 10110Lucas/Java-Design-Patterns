package SOLID.DependencyInversionPrinciple.correto;

public class LampadaDIP implements IDispositivo {
    
    @Override
    public void ligar() {
        System.out.println("Lâmpada ligada com DIP.");
    }

    @Override
    public void desligar() {
        System.out.println("Lâmpada desligada com DIP.");
    }
    
}
