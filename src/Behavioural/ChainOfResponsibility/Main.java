package Behavioural.ChainOfResponsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Behavioural.ChainOfResponsibility.middleware.Middleware;
import Behavioural.ChainOfResponsibility.middleware.RoleCheckMiddleware;
import Behavioural.ChainOfResponsibility.middleware.ThrottlingMiddleware;
import Behavioural.ChainOfResponsibility.middleware.UserExistsMiddleware;
import Behavioural.ChainOfResponsibility.server.Server;

/**
 * en-us: Demo class. Everything comes together here. <br>
 * pt-br: Classe de demonstração. Tudo se une aqui.
 */
public class Main {
    
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // en-us: All checks are linked. Client can build various chains using the same components.
        // pt-br: Todas as verificações estão vinculadas. O cliente pode construir várias cadeias usando os mesmos componentes.
        Middleware middleware = Middleware.link(
            new ThrottlingMiddleware(2),
            new UserExistsMiddleware(server),
            new RoleCheckMiddleware()
        );

        // en-us: Server gets a chain from client code.
        // pt-br: O servidor recebe uma cadeia do código do cliente.
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
