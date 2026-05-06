package SOLID.DependencyInversionPrinciple.correto;

public class InterruptorDIP {
    
    private IDispositivo dispositivo; // CORRETO: Dependência de abstração (interface)

    // Injeção de Dependência via Construtor
    public InterruptorDIP(IDispositivo dispositivo) {
        // O interruptor recebe qualquer dispositivo que implemente IDispositivo
        this.dispositivo = dispositivo; 
    }

    // O interruptor aciona o método ligar do dispositivo, sem se importar com a implementação concreta
    public void acionar() {
        dispositivo.ligar(); 
    }
}
