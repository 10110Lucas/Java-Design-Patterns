package Creation.Builder;

import Creation.Builder.builders.CarBuilder;
import Creation.Builder.builders.CarManualBuilder;
import Creation.Builder.cars.Car;
import Creation.Builder.cars.Manual;
import Creation.Builder.director.Director;

/**
 * en-us: Demo class. Everything comes together here. <br>
 * pt-br: Classe de demonstração. Tudo se encaixa aqui.
 */
public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        // en-us: Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        // ---
        // pt-br: O diretor recebe o objeto construtor concreto do cliente
        // (código de aplicação). Isso porque a aplicação sabe melhor qual
        // construtor usar para obter um produto específico.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // en-us: The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        // ---
        // pt-br: O produto final é frequentemente recuperado a partir de um objeto builder, já que
        // o Diretor não tem conhecimento e não depende de builders e produtos concretos.
        Car car = builder.getResult();
        System.out.println("Car built: " + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // en-us: Director may know several building recipes.
        // pt-br: O diretor pode conhecer várias receitas de construção.
        director.constructSportsCar(manualBuilder);

        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}