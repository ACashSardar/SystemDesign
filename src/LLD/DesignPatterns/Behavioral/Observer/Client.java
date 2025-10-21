package LLD.DesignPatterns.Behavioral.Observer;

public class Client {
    public static void main(String[] args) {
        StocksObservable observable = new IPhoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("akash@gmail.com", observable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("jayant@gmail.com", observable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("858342426", observable);
        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);
        // Invokes notify method internally.
        observable.setStockCount(5);
    }
}
