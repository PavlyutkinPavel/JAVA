public abstract class Transport {
    protected int powerH;
    protected int maxSpeed;
    protected double weight;
    protected String marka;

    protected Transport(int power, int maxspeed, double ves, String name) {
        powerH = power;
        maxSpeed = maxspeed;
        weight = ves;
        marka = name;
    }

    protected double countPower(int powerh) {
        return (double) powerh * 0.74;
    }

    Transport() {

    }

}
