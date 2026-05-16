package LLD.Multithreading.ThreadPoolExecutors;

public class VolatileKeyWordDemo {

    private volatile boolean sharedFlag = true;

    public void increment() {
        System.out.println("Inside increment, Curr Thread: " + Thread.currentThread().getName());
        int cnt = 0;
        while (sharedFlag) {
            System.out.println("Cnt=" + cnt);
            cnt++;
        }
    }

    public void stop() {
        System.out.println("Inside stop, Curr Thread:" + Thread.currentThread().getName());
        try {
            Thread.sleep(10);
            sharedFlag = false;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Counter stopped by Thread:" + Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        VolatileKeyWordDemo obj = new VolatileKeyWordDemo();
        Thread t1 = new Thread(obj::increment, "Thread-1");
        Thread t2 = new Thread(obj::stop, "Thread-2");
        t1.start();
        t2.start();
    }
}
