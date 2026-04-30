package Behavioural.Strategy;

import Behavioural.Strategy.Strategies.Order;
import Behavioural.Strategy.Strategies.PayByCreditCard;
import Behavioural.Strategy.Strategies.PayByPayPal;
import Behavioural.Strategy.Strategies.PayStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;

            // en-us: calculate cost
            // pt-br: calcular o custo
            String continueChoice;
            do {
                System.out.print("Please, select a product:\n" +
                        "1 - Mother board\n" +
                        "2 - CPU\n" +
                        "3 - HDD\n" +
                        "4 - Memory\n");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.print("Count: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.print("Do you wish to continue selecting products? Y/N: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("Please, select a payment method:" + "\n" +
                        "1 - PalPay" + "\n" +
                        "2 - Credit Card");
                String paymentMethod = reader.readLine();

                /* en-us: Client creates different strategies based on input from
                 * application configuration, etc.
                 * pt-br:  O cliente cria diferentes estratégias 
                 *  com base na entrada da configuração do aplicativo, etc. */
                if (paymentMethod.equals("1")) {
                    strategy = new PayByPayPal();
                } else {
                    strategy = new PayByCreditCard();
                }
            }

            /* en-us: Order object delegates gathering payment data to strategy
             * object, since only strategies know what data they need to process a payment.
             * pt-br: 
             *  O objeto Order delega a coleta de dados de pagamento para o objeto strategy,
             *  já que apenas as estratégias sabem quais dados precisam ser processados para realizar um pagamento. */
            order.processOrder(strategy);

            System.out.printf("Pay '%s' (press P) or Continue (press C) shopping? P/C: ", 
                String.format("$ %,d", order.getTotalCost())
            );

            String proceed = reader.readLine();
            if (proceed.equalsIgnoreCase("P")) {
                // en-us: Finally, strategy handles the payment.
                // pt-br: Finalmente, a estratégia lida com o pagamento.
                if (strategy.pay(order.getTotalCost())) {
                    System.out.println("Payment has been successful.");
                } else {
                    System.out.println("FAIL! Please, check your data.");
                }
                order.setClosed();
            }
        }
    }
}
