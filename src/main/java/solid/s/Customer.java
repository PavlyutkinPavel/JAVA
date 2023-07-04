package solid.s;

//example of class before SR principle

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private String address;

    private static List<String> customers = new ArrayList<>();

    public static void register(String name) {
        // logic for registration
        customers.add(name);
    }

    public void makePayment(double amount) {
        // logic for payment
    }

    public void sendNotification(String message) {
        // logic sending notification
    }
}
