public class CivilianAirTransport extends AirTransport {
    private int passengers;
    private boolean hasBisnessClass;

    CivilianAirTransport(int power, int maxspeed, double ves, String name, double wing, double minLen, int passenger, boolean bisnessClass) {
        super(power, maxspeed, ves, name, wing, minLen);
        passengers = passenger;
        hasBisnessClass = bisnessClass;
    }

    CivilianAirTransport() {

    }

    public void checkNumPassengers(int num_pass) {
        if (num_pass <= this.passengers) {
            System.out.println("\nПассажирам хватает мест");
        } else {
            System.out.println("\nПридется подыскать самолет побольше");
        }
    }

    void displayCharacteristics() {
        System.out.println("\nTransport:" + "\n.................................."
                + "\nMarka: " + this.marka + "\nMax speed: " + this.maxSpeed + "\nWeight: " + this.weight + "\nHorse power: " + this.powerH
                + "\nWingspan: " + this.wingspan + "\nMin length of landing zone: " + this.minLengthLandingZone
                + "\nNumber of passengers: " + this.passengers + "\nHas business class: " + this.hasBisnessClass
                + "\nPower kV: " + countPower(this.powerH)
                + "\n..................................");
    }
}
