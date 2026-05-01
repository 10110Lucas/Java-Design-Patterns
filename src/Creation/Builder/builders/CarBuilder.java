package Creation.Builder.builders;

import Creation.Builder.cars.Car;
import Creation.Builder.cars.CarType;
import Creation.Builder.components.Engine;
import Creation.Builder.components.GPSNavigator;
import Creation.Builder.components.Transmission;
import Creation.Builder.components.TripComputer;

/**
 * en-us: Concrete builders implement steps defined in the common interface. <br>
 * pt-br: Builders concretos implementam os passos definidos na interface comum.
 */
public class CarBuilder implements Builder {
    
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
