package patterns.hw31.decorator;

class TomatoDecorator extends PizzaDecorator {
    public TomatoDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return super.getDescription() + ", tomato";
    }

    public double getPrice() {
        return super.getPrice() + 3.0;
    }
}
