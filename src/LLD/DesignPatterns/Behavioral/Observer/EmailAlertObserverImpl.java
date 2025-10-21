package LLD.DesignPatterns.Behavioral.Observer;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail();
    }

    public void sendMail() {
        System.out.println("Mail sent to " + emailId);
    }
}
