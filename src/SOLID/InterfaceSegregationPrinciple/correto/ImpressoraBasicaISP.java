package SOLID.InterfaceSegregationPrinciple.correto;

public class ImpressoraBasicaISP implements IImpressora {

    @Override
    public void imprimir() {
        System.out.println("Imprimindo de forma simples...");
    }
    
}
