package patterns.hw30.proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ImageProxy("image.jpg");
        image.display();

        Image image1 = new RealImage("ldldl");
        image1.display();
    }
}
