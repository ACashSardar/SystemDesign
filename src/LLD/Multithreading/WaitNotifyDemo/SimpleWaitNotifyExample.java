package LLD.Multithreading.WaitNotifyDemo;

class SharedResource {

    // synchronized allows only 1 thread to access at a time.
    synchronized public void waitExample() {
        System.out.println("Current Thread: " + Thread.currentThread().getName() + " is going to wait...");
        try {
            wait(); // releases the lock and wait indefinitely until another thread notifies.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Current Thread: " + Thread.currentThread().getName() + " resumed after notify.");
    }

    synchronized public void notifyExample() {
        System.out.println("Current Thread: " + Thread.currentThread().getName() + " notifying a waiting thread.");
        notify(); // notifies any one of the threads if multiple threads are waiting.
    }
}

public class SimpleWaitNotifyExample {
    public static void main(String[] args) {
        
        SharedResource resource = new SharedResource();
        // Thread t1 waits
        Thread t1 = new Thread(resource::waitExample, "t1");

        // Thread t2 notifies after 2 sec
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            resource.notifyExample();
        }, "t2");

        t1.start();
        t2.start();
    }
}
