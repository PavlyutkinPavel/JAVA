public class AirTransport extends Transport {
    protected double wingspan;
    protected double minLengthLandingZone;

    protected AirTransport(int power, int maxspeed, double ves, String name, double wing, double minLen) {
        super(power, maxspeed, ves, name);
        wingspan = wing;
        minLengthLandingZone = minLen;
    }

    AirTransport() {

    }
}
