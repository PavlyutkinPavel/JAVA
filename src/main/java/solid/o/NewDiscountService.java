package solid.o;

//class with OC principle

import java.util.ArrayList;
import java.util.List;

public class NewDiscountService {
    private List<DiscountStrategy> strategiesOfDiscount;

    public NewDiscountService() {
        strategiesOfDiscount = new ArrayList<>();
        strategiesOfDiscount.add(new RegularDiscountStrategy());
        strategiesOfDiscount.add(new PremiumDiscountStrategy());
        strategiesOfDiscount.add(new VIPDiscountStrategy());
    }

    public double calculateDiscount(double totalPrice, String customerType) {
        DiscountStrategy strategy = getStrategy(customerType);
        return strategy.calculateDiscount(totalPrice);
    }

    private DiscountStrategy getStrategy(String customerType) {
        for (DiscountStrategy strategy : strategiesOfDiscount) {
            if (strategy.isApplicable(customerType)) {
                return strategy;
            }
        }
        throw new IllegalArgumentException("No strategy found for customer type: " + customerType);
    }
}

