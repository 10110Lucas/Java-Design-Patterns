package Creation.Builder.components;

import Creation.Builder.cars.Car;

/**
 * en-us: Just another feature of a car. <br>
 * pt-br: Apenas outra característica de um carro.
 */
public class TripComputer {
    
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
