package Behavioural.Strategy.Strategies;

/**
 * en-us: Order class. Doesn't know the concrete payment method (strategy) user has
 * picked. It uses common strategy interface to delegate collecting payment data
 * to strategy object. It can be used to save order to database.
 * 
 * pt-br: Classe Order. Não conhece o método de pagamento concreto (estratégia) que o usuário escolheu.
 * Ele usa a interface de estratégia comum para delegar a coleta de dados de pagamento
 * para o objeto de estratégia. Ele pode ser usado para salvar o pedido no banco de dados.
 */
public class Order {

    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
        // en-us: Here we could collect and store payment data from the strategy.
        // pt-br: Aqui poderíamos coletar e armazenar os dados de pagamento da estratégia.
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}