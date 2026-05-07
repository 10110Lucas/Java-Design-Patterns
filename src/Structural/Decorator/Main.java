package Structural.Decorator;

import Structural.Decorator.decorators.CompressionDecorator;
import Structural.Decorator.decorators.DataSourceDecorator;
import Structural.Decorator.decorators.EncryptionDecorator;
import Structural.Decorator.decorators.FileDataSource;
import Structural.Decorator.decorators.DataSource;

public class Main {
    
    public static void main(String[] args) {

        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        String fileName = "src\\Structural\\Decorator\\out\\OutputDemo.txt";

        // Criamos uma pilha: Compactação -> Criptografia -> Arquivo Real
        DataSourceDecorator encoded = new CompressionDecorator(
                                         new EncryptionDecorator(
                                             new FileDataSource(fileName)));
        
        // Ao chamar writeData, ele passará por todas as camadas automaticamente!
        encoded.writeData(salaryRecords);
        
        // Obtem apenas um componente base para ler os dados do arquivo.
        DataSource plain = new FileDataSource(fileName);
        
        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());

        System.out.println("- Decoded --------------");
        // Lê os dados do arquivo, usando a combinação de decoradores para descriptografar e extrair os dados.
        System.out.println(encoded.readData());
    }
}
