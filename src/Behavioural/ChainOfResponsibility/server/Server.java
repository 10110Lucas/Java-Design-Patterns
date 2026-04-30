package Behavioural.ChainOfResponsibility.server;

import java.util.HashMap;
import java.util.Map;

import Behavioural.ChainOfResponsibility.middleware.Middleware;

/**
 * en-us: Server class. <br>
 * pt-br: Classe de servidor.
 */
public class Server {

    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    /**
     * en-us: Client passes a chain of object to server. This improves flexibility and
     * makes testing the server class easier. <br>
     * pt-br: O cliente passa uma cadeia de objetos para o servidor. Isso melhora a flexibilidade e
     * torna o teste da classe servidor mais fácil.
     */
    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    /**
     * en-us: Server gets email and password from client and sends the authorization
     * request to the chain. <br>
     * pt-br: O servidor recebe o email e a senha do cliente e envia a solicitação de autorização
     * para a cadeia.
     */
    public boolean logIn(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("Authorization have been successful!");

            // en-us: Do something useful here for authorized users.
            // pt-br: Faça algo útil aqui para usuários autorizados.

            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}
