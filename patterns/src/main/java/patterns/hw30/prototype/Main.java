package patterns.hw30.prototype;

public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape1 = ShapeCache.getShape("Rectangle");
        System.out.println("Shape: " + clonedShape1.getType());

        Shape clonedShape2 = ShapeCache.getShape("Circle");
        System.out.println("Shape: " + clonedShape2.getType());

        clonedShape1.draw();
        System.out.println(clonedShape1.getType());
    }
}
