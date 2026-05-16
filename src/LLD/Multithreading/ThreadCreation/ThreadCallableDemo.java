package LLD.Multithreading.ThreadCreation;


import java.util.concurrent.*;

class MyCallableThread implements Callable<String> {
    private String name;

    MyCallableThread(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" Callable task is Running...");
        Thread.sleep(5000);
        return sb.toString();
    }
}

public class ThreadCallableDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<String> callable1 = new MyCallableThread("Task-1");
        Callable<String> callable2 = new MyCallableThread("Task-2");

        try {
            Future<String> future1 = executor.submit(callable1);
            Future<String> future2 = executor.submit(callable2);
            System.out.println("Results from the Task-1");
            System.out.println(future1.get());
            System.out.println("Results from the Task-2");
            System.out.println(future2.get());
        } catch (Exception ex) {
            System.out.println("Task execution interrupted " + ex);
        } finally {
            executor.shutdown();
            System.out.println("Executor service is shut down");
        }

    }
}
