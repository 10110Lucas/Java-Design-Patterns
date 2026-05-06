package SOLID.OpenClosedPrinciple.correto;

public class CalculadoraDeDescontoOCP {
    
    // FECHADA para modificação: Ela não sabe quais tipos de desconto existem.
    // ABERTA para extensão: Aceita qualquer classe que implemente 'Desconto'.
    public double calcular(double valor, Desconto desconto) {
        
        return desconto.aplicar(valor);
    }
}
