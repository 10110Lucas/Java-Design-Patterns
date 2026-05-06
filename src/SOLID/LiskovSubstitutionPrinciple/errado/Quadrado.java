package SOLID.LiskovSubstitutionPrinciple.errado;

public class Quadrado extends Retangulo {

    // VIOLAÇÃO: O quadrado altera o comportamento esperado da classe pai
    @Override
    public void setLargura(int largura) {
        this.largura = largura;
        this.altura = largura; // Força lados iguais
    }

    @Override
    public void setAltura(int altura) {
        this.altura = altura;
        this.largura = altura; // Força lados iguais
    }
}
