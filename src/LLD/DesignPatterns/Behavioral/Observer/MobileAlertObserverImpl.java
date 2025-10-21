package LLD.DesignPatterns.Behavioral.Observer;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String phoneNo;
    StocksObservable observable;

    public MobileAlertObserverImpl(String phoneNo, StocksObservable observable) {
        this.phoneNo = phoneNo;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMessage();
    }

    public void sendMessage() {
        System.out.println("Message sent to " + phoneNo);
    }
}
