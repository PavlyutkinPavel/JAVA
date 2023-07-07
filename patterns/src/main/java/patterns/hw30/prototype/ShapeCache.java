package patterns.hw30.prototype;

import java.util.HashMap;
import java.util.Map;

class ShapeCache {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Rectangle rectangle = new Rectangle();
        shapeMap.put(rectangle.getType(), rectangle);

        Circle circle = new Circle();
        shapeMap.put(circle.getType(), circle);
    }
}
