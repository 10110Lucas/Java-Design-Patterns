package Behavioural.ChainOfResponsibility.middleware;

/**
 * en-us: Base middleware class. <br>
 * pt-br: Classe de middleware abstrata.
 */
public abstract class Middleware {
    
    private Middleware next;

    /**
     * en-us: Builds chains of middleware objects. <br>
     * pt-br: Constrói cadeias de objetos de middleware.
     */
    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    /**
     * en-us: Subclasses will implement this method with concrete checks. <br>
     * pt-br: As subclasses irão implementar este método com verificações concretas.
     */
    public abstract boolean check(String email, String password);

    /**
     * en-us: Runs check on the next object in chain or ends traversing if we're in
     *        last object in chain.
     * <br><br>
     * pt-br: Executa a verificação no próximo objeto na cadeia ou encerra a travessia se estivermos no
     *        último objeto da cadeia.
     */
    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}
