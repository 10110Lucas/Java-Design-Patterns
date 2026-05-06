package SOLID.InterfaceSegregationPrinciple.correto;

public class SuperImpressoraISP implements IImpressora, IScanner {

    @Override
    public void imprimir() {
        System.out.println("Impressão de alta qualidade...");
    }

    @Override
    public void escanear() {
        System.out.println("Digitalizando para PDF...");
    }
    
}
