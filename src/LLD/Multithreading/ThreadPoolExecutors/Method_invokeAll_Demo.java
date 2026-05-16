package LLD.Multithreading.ThreadPoolExecutors;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Method_invokeAll_Demo {
    public static void main(String[] args) {
        ExecutorService executors = Executors.newFixedThreadPool(2);
        List<Callable<String>> listOfTasks = List.of(
                () -> {
                    System.out.println("Task1");
                    return "Task1";
                },
                () -> {
                    System.out.println("Task2");
                    return "Task2";
                },
                () -> {
                    System.out.println("Task3");
                    return "Task3";
                }
        );
        try {
            // Runs all the tasks in parallel. Wait until all the tasks are finished and the returns a list of future.
            executors.invokeAll(listOfTasks);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executors.shutdown();
    }
}
