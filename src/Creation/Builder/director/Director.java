package Creation.Builder.director;

import Creation.Builder.builders.Builder;
import Creation.Builder.cars.CarType;
import Creation.Builder.components.Engine;
import Creation.Builder.components.GPSNavigator;
import Creation.Builder.components.Transmission;
import Creation.Builder.components.TripComputer;

/**
 * en-us: Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built. <br>
 * pt-br: Diretor define a ordem dos passos de construção. Ele trabalha com um objeto
 * através da interface comum do Builder. Portanto, ele pode não saber qual produto está
 * sendo construído.
 */
public class Director {
    
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
