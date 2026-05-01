package Creation.Builder.builders;

import Creation.Builder.cars.CarType;
import Creation.Builder.components.Engine;
import Creation.Builder.components.GPSNavigator;
import Creation.Builder.components.Transmission;
import Creation.Builder.components.TripComputer;

/**
 * en-us: Builder interface defines all possible ways to configure a product. <br>
 * pt-br: Interface Builder define todos os possíveis caminhos para configurar um produto.
 */
public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}