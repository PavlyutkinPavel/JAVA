package patterns.hw31.decorator;

public class Margherita implements Pizza {
    @Override
    public String getDescription() {
        return "Margherita";
    }

    @Override
    public double getPrice() {
        return 15.0;
    }
}
