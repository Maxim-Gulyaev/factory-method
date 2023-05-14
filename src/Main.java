import factory.BolidCreator;
import factory.CarCreator;
import factory.TrackCreator;
import vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {

        CarCreator carCreator = new CarCreator();
        TrackCreator trackCreator = new TrackCreator();
        BolidCreator bolidCreator = new BolidCreator();

        Vehicle car = carCreator.makeVehicle();
        Vehicle track = trackCreator.makeVehicle();
        Vehicle bolid = bolidCreator.makeVehicle();

        car.go();
        track.go();
        bolid.go();
    }
}