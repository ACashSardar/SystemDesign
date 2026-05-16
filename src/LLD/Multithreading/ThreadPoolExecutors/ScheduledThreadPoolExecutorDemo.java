package LLD.Multithreading.ThreadPoolExecutors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutorDemo {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(() -> {
            System.out.println(Thread.currentThread().getName() + " says Ting tong...");
        }, 0, 2, TimeUnit.SECONDS);
    }
}
