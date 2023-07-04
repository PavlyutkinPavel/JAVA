package solid.o;

public interface DiscountStrategy {
    boolean isApplicable(String customerType);

    double calculateDiscount(double totalPrice);
}
