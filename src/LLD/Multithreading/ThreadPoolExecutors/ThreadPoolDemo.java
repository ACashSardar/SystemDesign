package LLD.Multithreading.ThreadPoolExecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
    private int taskId;

    WorkerThread(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is starting the task " + taskId);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " has finished the task " + taskId);
    }
}

public class ThreadPoolDemo {
    public static void main(String[] args) {
        // Create a fixed thread pool with size 3
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submit 5 task to the thread pool
        for (int i = 1; i <= 5; i++) {
            executorService.submit(new WorkerThread(i));
        }

        // Shutdown the ExecutorService
        executorService.shutdown();
    }
}
