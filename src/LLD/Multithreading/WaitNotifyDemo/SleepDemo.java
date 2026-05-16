package LLD.Multithreading.WaitNotifyDemo;

class SharedResource2 {

    // synchronized allows only 1 thread to access at a time.
    synchronized public void sleepExample() {
        System.out.println("Current Thread: " + Thread.currentThread().getName() + " is going to sleep...");
        try {
            Thread.sleep(2000); // keeps the lock and pause the execution for a specific time.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Current Thread: " + Thread.currentThread().getName() + " resumed after sleep is over.");
    }
}

public class SleepDemo {
    public static void main(String[] args) {
        SharedResource2 resource = new SharedResource2();
        Thread t1 = new Thread(resource::sleepExample, "t1");
        Thread t2 = new Thread(resource::sleepExample, "t2");
        // Thread t2 will not be able to access sleepExample method until t1 releases the lock
        t1.start();
        t2.start();
    }
}
