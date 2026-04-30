package Behavioural.Strategy.Strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCard implements PayStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    /**
     * en-us: Collect credit card data.
     * pt-br: Coletar dados do cartão de crédito.
     */
    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("Enter the card number: ");
            String number = READER.readLine();
            System.out.print("Enter the card expiration date 'mm/yy': ");
            String date = READER.readLine();
            System.out.print("Enter the CVV code: ");
            String cvv = READER.readLine();
            card = new CreditCard(number, date, cvv);

            // en-us: Validate credit card number.
            // pt-br: Validar número do cartão de crédito.

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * en-us: After card validation we can charge customer's credit card.
     * pt-br: Após a validação do cartão, podemos cobrar o cartão de crédito do cliente.
     */
    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Paying " + String.format("$ %,d", paymentAmount) + " using Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return this.card != null;
    }
}
