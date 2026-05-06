package SOLID.InterfaceSegregationPrinciple.errado;

public class ImpressoraBasica implements IDispositivoMultifuncional {

    @Override
    public void imprimir() {
        System.out.println("Imprimindo documento...");
    }

    @Override
    public void escanear() {
        // VIOLAÇÃO: Esta impressora não tem scanner!
        // Sou obrigado a implementar algo que não faz sentido.
        throw new UnsupportedOperationException("Este dispositivo não possui scanner.");
    }
    
}
