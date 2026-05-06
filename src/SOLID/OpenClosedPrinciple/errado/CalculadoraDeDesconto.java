package SOLID.OpenClosedPrinciple.errado;

public class CalculadoraDeDesconto {
    
    public double aplicarDesconto(double valor, String tipoCliente) {
        // VIOLAÇÃO: Toda vez que surgir um novo tipo de cliente, 
        // teremos que modificar esta classe.
        if (tipoCliente.equalsIgnoreCase("ESTUDANTE")) {
            return valor * 0.5;
        } else if (tipoCliente.equalsIgnoreCase("VIP")) {
            return valor * 0.8;
        }
        return valor;
    }
}
