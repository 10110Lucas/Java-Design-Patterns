package SOLID.LiskovSubstitutionPrinciple.correto;

public class RetanguloLSP implements IForma {

    private int largura;
    private int altura;

    public RetanguloLSP(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public int getArea() {
        return largura * altura;
    }
}
