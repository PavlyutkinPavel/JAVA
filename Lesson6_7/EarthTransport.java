public class EarthTransport extends Transport {
    protected int numWheels;
    protected double fuelСonsumption;

    protected EarthTransport(int power, int maxspeed, double ves, String name, int wheels, double fuel) {
        super(power, maxspeed, ves, name);
        numWheels = wheels;
        fuelСonsumption = fuel;
    }

    EarthTransport() {

    }

}
