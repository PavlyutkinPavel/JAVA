package patterns.hw30.fabricMethod;

public class RoadLogistics extends Logistics {
    protected Transport createTransport() {
        return new Car();
    }
}
