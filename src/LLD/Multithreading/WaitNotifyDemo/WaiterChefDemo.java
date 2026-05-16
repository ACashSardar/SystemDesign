package LLD.Multithreading.WaitNotifyDemo;

class WaiterThread implements Runnable {

    private final Object lock;

    WaiterThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try {
                System.out.println("Waiter: Waiting for the food to be prepared by Chef.");
                lock.wait();
                System.out.println("Waiter: Food is ready! Delivering to the customers.");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

class ChefThread implements Runnable {

    private final Object lock;

    ChefThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try {
                System.out.println("Chef: Food is getting prepared...pls wait.");
                Thread.sleep(2000);
                System.out.println("Chef: Food is ready. Notifying the waiter.");
                lock.notify();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class WaiterChefDemo {
    public static void main(String[] args) {
        Object lock = new Object();
        Thread waiterThread = new Thread(new WaiterThread(lock));
        Thread chefThread = new Thread(new ChefThread(lock));
        waiterThread.start();
        chefThread.start();
    }
}
