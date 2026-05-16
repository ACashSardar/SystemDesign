package LLD.Multithreading.ThreadCreation;

class MyExtendThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyExtendThread is started");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("MyExtendThread is ended");
    }
}

class MyRunnableThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " is ended");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " started");

        // By Extending Thread class
        Thread myExtendThread = new MyExtendThread();
        myExtendThread.start();

        // By Implementing Runnable interface.
        // We can pass the thread name in the constructor.
        // Runnable approach is better because we can implement multiple interface if needed.
        // whereas with the Thread class approach we are limited to extending a single class.
        Thread myRunnableThread = new Thread(new MyRunnableThread(), "Runnable thread");
        myRunnableThread.start();

        // Using Lambda to implement Run method
        Runnable obj = () -> {
            System.out.println(Thread.currentThread().getName() + " is started");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " is ended");
        };
        Thread myLambdaThread = new Thread(obj, "Lambda thread");
        myLambdaThread.start();

        System.out.println(Thread.currentThread().getName() + " ended");
    }
}
