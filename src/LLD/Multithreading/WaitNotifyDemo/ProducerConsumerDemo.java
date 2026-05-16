package LLD.Multithreading.WaitNotifyDemo;

import java.util.LinkedList;
import java.util.Queue;


public class ProducerConsumerDemo {
    // shared resource
    public Queue<Integer> queue = new LinkedList<>();
    public int CAPACITY = 4;
    private final Object lock = new Object();


    public void produce() {
        int item = 1;
        while (true) {
            synchronized (lock) {
                while (queue.size() == CAPACITY) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("item: " + item + " Produced by " + Thread.currentThread().getName());
                queue.add(item++);
                lock.notify();
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void consume() {
        while (true) {
            synchronized (lock) {
                while (queue.isEmpty()) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                int item = queue.poll();
                System.out.println("item: " + item + " Consumed by " + Thread.currentThread().getName());
                lock.notify();
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        ProducerConsumerDemo pc = new ProducerConsumerDemo();
        Thread pt = new Thread(pc::produce, "Thread-Producer");
        Thread ct = new Thread(pc::consume, "Thread-Consumer");
        pt.start();
        ct.start();
    }
}
