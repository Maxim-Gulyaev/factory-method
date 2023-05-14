package factory;

import vehicle.Track;
import vehicle.Vehicle;

public class TrackCreator extends Creator {
    @Override
    public Vehicle makeVehicle() {
        return new Track();
    }
}
