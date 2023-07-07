package patterns.hw31.facade;

public class Main {
    public static void main(String[] args) {
        CarFacade car = new CarFacade();

        car.startCar();
        System.out.println("--------------------------------");
        car.stopCar();
    }
}
