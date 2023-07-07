package patterns.hw31.chainOfResponsibility;

public interface PaymentHandler {
    boolean canHandle(float amount);
    void handlePayment(float amount);
    void setNextPaymentHandler(PaymentHandler handler);
}
