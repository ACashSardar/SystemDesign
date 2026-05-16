package LLD.Multithreading.ThreadPoolExecutors;

public class SynchronizedMethodDemo {

    private final Object lock = new Object();

    private int counter = 0;

    // Only one thread can access
    public synchronized void incrementSyncFunc() {
        System.out.println("Sync method, starting increment, current thread=" + Thread.currentThread().getName());
        counter++;
        System.out.println("Sync method, updated counter value=" + counter + ", current thread=" + Thread.currentThread().getName());
        System.out.println("Sync method, ending increment, current thread=" + Thread.currentThread().getName());
    }

    public void incrementSyncBlock() {
        System.out.println("Non-sync part pre-processing, current thread=" + Thread.currentThread().getName());
        synchronized (lock) {
            System.out.println("Sync part, starting increment, current thread=" + Thread.currentThread().getName());
            counter++;
            System.out.println("Sync part, updated counter value=" + counter + ", current thread=" + Thread.currentThread().getName());
            System.out.println("Sync part, ending increment, current thread=" + Thread.currentThread().getName());
        }
        System.out.println("Non-sync part post-processing, current thread=" + Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        SynchronizedMethodDemo obj1 = new SynchronizedMethodDemo();
        int no_of_threads = 5;
        Thread[] threads = new Thread[no_of_threads];
        for (int i = 0; i < no_of_threads; i++) {
//            threads[i] = new Thread(obj1::incrementSyncFunc, "Thread: " + (i + 1));
            threads[i] = new Thread(obj1::incrementSyncBlock, "Thread: " + (i + 1));
            threads[i].start();
        }

        // Wait for all the threads to complete
        for (int i = 0; i < no_of_threads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        // Finally print the value of the counter
        System.out.println("Counter=" + obj1.counter);
    }
}
