package solid.o;

public class PremiumDiscountStrategy implements DiscountStrategy {
    @Override
    public boolean isApplicable(String customerType) {
        return customerType.equals("Premium");
    }

    @Override
    public double calculateDiscount(double totalPrice) {
        return totalPrice * 0.2;
    }
}
