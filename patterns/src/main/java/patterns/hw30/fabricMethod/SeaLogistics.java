package patterns.hw30.fabricMethod;

public class SeaLogistics extends Logistics {
    protected Transport createTransport() {
        return new Ship();
    }
}
