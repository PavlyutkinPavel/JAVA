package patterns.hw31.chainOfResponsibility;

class PaypalPaymentHandler implements PaymentHandler {
    private float limit;
    private PaymentHandler nextHandler;

    public PaypalPaymentHandler(float limit) {
        this.limit = limit;
    }
    @Override
    public void setNextPaymentHandler(PaymentHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public boolean canHandle(float amount) {
        return amount <= limit;
    }

    @Override
    public void handlePayment(float amount) {
        if (canHandle(amount)) {
            System.out.println("Processing paypal payment: $" + amount + ".....");
        } else if (nextHandler != null) {
            nextHandler.handlePayment(amount);
        } else {
            System.out.println("Error: Cannot process the payment...");
        }
    }
}
