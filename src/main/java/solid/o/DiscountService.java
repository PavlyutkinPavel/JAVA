package solid.o;

//bad example of class

public class DiscountService {
    private double discount = 0.0;

    public double calculateDiscount(double totalPrice, String customerType) {
        if (customerType.equals("Regular")) {
            discount = totalPrice * 0.1; // 10% for usual clients
        } else if (customerType.equals("Premium")) {
            discount = totalPrice * 0.2; // 20% for premium clients
        } else if (customerType.equals("VIP")) {
            discount = totalPrice * 0.3; // 30% for VIP-clients
        }
        return discount;
    }
}
