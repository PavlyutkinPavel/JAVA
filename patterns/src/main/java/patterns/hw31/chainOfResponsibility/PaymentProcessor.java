package patterns.hw31.chainOfResponsibility;

class PaymentProcessor {
    private PaymentHandler paymentHandlerChain;

    public void setPaymentHandlerChain(PaymentHandler paymentHandlerChain) {
        this.paymentHandlerChain = paymentHandlerChain;
    }

    public void processPayment(float amount) {
        if (paymentHandlerChain.canHandle(amount)) {
            paymentHandlerChain.handlePayment(amount);
        } else {
            System.out.println("Payment amount is too high, cannot process.");
        }
    }
}

