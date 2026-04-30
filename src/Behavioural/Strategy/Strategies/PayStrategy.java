package Behavioural.Strategy.Strategies;
/**
 * en-us: Common interface for all strategies.
 * pt-br: Interface comum para todas as estratégias.
 */
public interface PayStrategy {
    
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}