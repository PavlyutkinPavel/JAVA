package solid.o;

public class RegularDiscountStrategy implements DiscountStrategy {
    @Override
    public boolean isApplicable(String customerType) {
        return customerType.equals("Regular");
    }
    @Override
    public double calculateDiscount(double totalPrice) {
        return totalPrice * 0.1;
    }
}
