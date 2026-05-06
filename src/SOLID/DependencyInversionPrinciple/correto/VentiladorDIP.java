package SOLID.DependencyInversionPrinciple.correto;

public class VentiladorDIP implements IDispositivo {
    
    @Override
    public void ligar() {
        System.out.println("Ventilador girando...");
    }

    @Override
    public void desligar() {
        System.out.println("Ventilador parado.");
    }
    
}
