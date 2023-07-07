package patterns.hw30.prototype;

public abstract class Shape implements Cloneable {
    protected String type;

    public abstract void draw();

    public String getType() {
        return type;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return clone;
    }
}

