package factory;

import vehicle.Bolid;
import vehicle.Vehicle;

public class BolidCreator extends Creator {
    @Override
    public Vehicle makeVehicle() {
        return new Bolid();
    }
}
