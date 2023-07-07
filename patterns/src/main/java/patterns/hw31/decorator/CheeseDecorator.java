package patterns.hw31.decorator;

class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return super.getDescription() + ", cheese";
    }

    public double getPrice() {
        return super.getPrice() + 5.0;
    }
}
