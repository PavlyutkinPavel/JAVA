package patterns.hw31.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Margherita();
        CheeseDecorator cheeseDecorator =  new CheeseDecorator(pizza);

        System.out.println("Description: " + cheeseDecorator.getDescription());
        System.out.println("Cost: " + cheeseDecorator.getPrice());
    }
}
