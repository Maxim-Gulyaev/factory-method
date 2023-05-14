package factory;

import vehicle.Car;
import vehicle.Vehicle;

public class CarCreator extends Creator {
    @Override
    public Vehicle makeVehicle() {
        return new Car();
    }
}
