public class CargoTransport extends EarthTransport {
    double loadCapacity;

    CargoTransport(int power, int maxspeed, double ves, String name, int wheels, double fuel, double loadC) {
        super(power, maxspeed, ves, name, wheels, fuel);
        loadCapacity = loadC;
    }

    public void checkLoadCapacity(double l_capacity) {
        if (l_capacity <= this.loadCapacity) {
            System.out.println("\nГрузовик загружен");
        } else {
            System.out.println("\nВам нужен грузовик побольше");
        }
    }

    void displayCharacteristics() {
        System.out.println("\nTransport:" + "\n.................................."
                + "\nMarka: " + this.marka + "\nMax speed: " + this.maxSpeed + "\nWeight: " + this.weight + "\nHorse power: " + this.powerH
                + "\nNumber of wheels: " + this.numWheels + "\nFuel consumption: " + this.fuelСonsumption
                + "\nLoad capacity: " + this.loadCapacity
                + "\nPower kV: " + countPower(this.powerH)
                + "\n..................................");
    }
}
