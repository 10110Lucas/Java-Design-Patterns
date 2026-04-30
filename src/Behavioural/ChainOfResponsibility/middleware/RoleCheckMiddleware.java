package Behavioural.ChainOfResponsibility.middleware;

/**
 * en-us: ConcreteHandler. Checks user's role. <br>
 * pt-br: ManipuladorConcreto. Verifica o papel do usuário.
 */
public class RoleCheckMiddleware extends Middleware {

    @Override
    public boolean check(String email, String password) {

        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
