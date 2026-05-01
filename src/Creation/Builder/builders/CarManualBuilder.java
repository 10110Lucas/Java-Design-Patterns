package Creation.Builder.builders;

import Creation.Builder.cars.CarType;
import Creation.Builder.cars.Manual;
import Creation.Builder.components.Engine;
import Creation.Builder.components.GPSNavigator;
import Creation.Builder.components.Transmission;
import Creation.Builder.components.TripComputer;

/**
 * en-us: Unlike other creational patterns, Builder can construct unrelated products,
 * which don't have the common interface. <br>
 * In this case we build a user manual for a car, using the same steps as we
 * built a car. This allows to produce manuals for specific car models,
 * configured with different features.
 * <br><br>
 * pt-br: Diferente dos outros padrões criacionais, o Builder pode construir produtos
 * não relacionados, que não possuem uma interface comum. <br>
 * Neste caso, construímos um manual do usuário para um carro, usando os mesmos passos que usamos
 * para construir um carro. Isso permite produzir manuais para modelos de carros específicos,
 * configurados com diferentes recursos.
 */
public class CarManualBuilder implements Builder {
    
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

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
