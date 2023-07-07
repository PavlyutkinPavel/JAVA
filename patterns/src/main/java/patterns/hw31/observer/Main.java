package patterns.hw31.observer;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Observer emailSubscriber = new EmailSubscriber("pashaP@gmail.com");
        publisher.addObserver(emailSubscriber);

        Observer smsSubscriber = new SMSSubscriber("+2333143");
        publisher.addObserver(smsSubscriber);

        publisher.notifyObservers("message 1");

        publisher.removeObserver(emailSubscriber);

        publisher.notifyObservers("message 2");
    }
}
