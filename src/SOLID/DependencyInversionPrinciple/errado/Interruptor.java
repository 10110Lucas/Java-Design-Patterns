package SOLID.DependencyInversionPrinciple.errado;

public class Interruptor {

    private Lampada lampada; // ACERTO: Dependência direta de classe concreta

    public Interruptor() {
        this.lampada = new Lampada(); // O interruptor "nasce" preso à lâmpada
    }

    public void acionar() {
        lampada.ligar();
    }
}
