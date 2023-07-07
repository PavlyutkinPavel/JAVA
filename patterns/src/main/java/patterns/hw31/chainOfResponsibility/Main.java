package patterns.hw31.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        PaymentHandler cashPaymentHandler = new CashPaymentHandler(100);
        PaymentHandler creditCardPaymentHandler = new CreditCardPaymentHandler(500);
        PaymentHandler paypalPaymentHandler = new PaypalPaymentHandler(1000);

        cashPaymentHandler.setNextPaymentHandler(creditCardPaymentHandler);
        creditCardPaymentHandler.setNextPaymentHandler(paypalPaymentHandler);

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.setPaymentHandlerChain(creditCardPaymentHandler);

        paymentProcessor.processPayment(50);
        paymentProcessor.processPayment(200);
        paymentProcessor.processPayment(800);
    }
}
