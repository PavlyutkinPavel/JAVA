package solid.o;

public class VIPDiscountStrategy implements DiscountStrategy {
    @Override
    public boolean isApplicable(String customerType) {
        return customerType.equals("VIP");
    }

    @Override
    public double calculateDiscount(double totalPrice) {
        return totalPrice * 0.3;
    }
}
