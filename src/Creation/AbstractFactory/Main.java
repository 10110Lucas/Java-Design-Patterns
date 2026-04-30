package Creation.AbstractFactory;

import Creation.AbstractFactory.app.Application;
import Creation.AbstractFactory.factories.GUIFactory;
import Creation.AbstractFactory.factories.MacOSFactory;
import Creation.AbstractFactory.factories.WindowsFactory;

public class Main {
        
    /**
     * en-us: Application picks the factory type and creates it in run time (usually at
     *        initialization stage), depending on the configuration or environment
     *        variables.
     * <br><br>
     * pt-br: A aplicação escolhe o tipo de fábrica e a cria em tempo de execução (geralmente na
     *        etapa de inicialização), dependendo da configuração ou variáveis de ambiente.
     */
    private static Application configureApplication() {

        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
            
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
