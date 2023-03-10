public class MilitaryAirTransport extends AirTransport {
    boolean hasCatapulta;
    int rockets;

    MilitaryAirTransport(int power, int maxspeed, double ves, String name, double wing, double minLen, int rocket, boolean catapulta) {
        super(power, maxspeed, ves, name, wing, minLen);
        rockets = rocket;
        hasCatapulta = catapulta;
    }

    MilitaryAirTransport() {

    }

    public void checkRockets() {
        if (this.rockets != 0) {
            System.out.println("\nРакета пошла..");
            this.rockets--;
        } else {
            System.out.println("\nБоеприпасы отсутствуют");
        }
    }

    public void checkCatapulta() {
        if (this.hasCatapulta) {
            System.out.println("\nКатапультирование прошло успешно");
        } else {
            System.out.println("\nОтсутствует данная система");
        }
    }

    void displayCharacteristics() {
        System.out.println("\nTransport:" + "\n.................................."
                + "\nMarka: " + this.marka + "\nMax speed: " + this.maxSpeed + "\nWeight: " + this.weight + "\nHorse power: " + this.powerH
                + "\nWingspan: " + this.wingspan + "\nMin length of landing zone: " + this.minLengthLandingZone
                + "\nNumber of rockets: " + this.rockets + "\nHas catapulta: " + this.hasCatapulta
                + "\nPower kV: " + countPower(this.powerH)
                + "\n..................................");
    }
}
