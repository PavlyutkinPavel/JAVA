public class PassengerTransport extends EarthTransport {
    String typeBodywork;
    int passengers;

    PassengerTransport(int power, int maxspeed, double ves, String name, int wheels, double fuel, String typeBody, int passenger) {
        super(power, maxspeed, ves, name, wheels, fuel);
        typeBodywork = typeBody;
        passengers = passenger;
    }

    PassengerTransport() {

    }

    private double countFuelConsumption(double fuel) {
        return fuel * this.maxSpeed / 100;
    }

    public void countTimeCharacteristics(double time) {
        System.out.println("\nЗа время " + time + " ч, автомобиль " + this.marka + " двигаясь с максимальной скоростью " +
                maxSpeed + " км/ч проедет " + time * this.maxSpeed + " км и израсходует " + countFuelConsumption(this.fuelСonsumption) * time + " литров топлива.");
    }

    void displayCharacteristics() {
        System.out.println("\nTransport:" + "\n.................................."
                + "\nMarka: " + this.marka + "\nMax speed: " + this.maxSpeed + "\nWeight: " + this.weight + "\nHorse power: " + this.powerH
                + "\nNumber of wheels: " + this.numWheels + "\nFuel consumption: " + this.fuelСonsumption
                + "\nType of bodywork: " + this.typeBodywork + "\nNumber of passengers: " + this.passengers
                + "\nPower kV: " + countPower(this.powerH)
                + "\n..................................");
    }
}
