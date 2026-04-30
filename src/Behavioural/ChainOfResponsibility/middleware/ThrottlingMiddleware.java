package Behavioural.ChainOfResponsibility.middleware;

/**
 * en-us: ConcreteHandler. Checks whether there are too many failed login requests. <br>
 * pt-br: ManipuladorConcreto. Verifica se há muitas solicitações de login com falha.
 */
public class ThrottlingMiddleware extends Middleware {
    
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
    }

    /**
     * en-us: Please, note that checkNext() call can be inserted both in the beginning
     * of this method and in the end. <br>
     * This gives much more flexibility than a simple loop over all middleware
     * objects. For instance, an element of a chain can change the order of
     * checks by running its check after all other checks.
     * <br><br>
     * pt-br: Por favor, note que a chamada checkNext() pode ser inserida tanto no início
     * deste método quanto no final. <br>
     * Isso dá muito mais flexibilidade do que um simples loop sobre todos os objetos de middleware. <br>
     * Por exemplo, um elemento de uma cadeia pode alterar a ordem das verificações executando sua 
     * verificação após todas as outras verificações.
     */
    @Override
    public boolean check(String email, String password) {
        if (System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }

        request++;
        
        if (request > requestPerMinute) {
            System.out.println("Request limit exceeded!");
            Thread.currentThread().stop();
        }
        return checkNext(email, password);
    }
}
