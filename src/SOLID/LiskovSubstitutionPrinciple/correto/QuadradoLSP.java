package SOLID.LiskovSubstitutionPrinciple.correto;

public class QuadradoLSP implements IForma {

    private int lado;

    public QuadradoLSP(int lado) {
        this.lado = lado;
    }

    @Override
    public int getArea() {
        return lado * lado;
    }
}
