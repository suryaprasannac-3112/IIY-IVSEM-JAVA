package Multithreading;

import java.util.LinkedList;

class SharedBuffer {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (buffer.size() == capacity) {
            System.out.println("Buffer full. Producer waiting...");
            wait();
        }
        buffer.add(value);
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer empty. Consumer waiting...");
            wait();
        }
        int value = buffer.removeFirst();
        System.out.println("Consumed: " + value);
        notify();
        return value;
    }
}

class Producer extends Thread {
    private SharedBuffer sharedBuffer;

    public Producer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    public void run() {
        int value = 0;
        try {
            while (true) {
                sharedBuffer.produce(value++);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Producer interrupted.");
        }
    }
}

class Consumer extends Thread {
    private SharedBuffer sharedBuffer;

    public Consumer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    public void run() {
        try {
            while (true) {
                sharedBuffer.consume();
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Consumer interrupted.");
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        System.out.println("--- Producer-Consumer Synchronization Demo ---");
        SharedBuffer sharedBuffer = new SharedBuffer();
        
        Producer producer = new Producer(sharedBuffer);
        Consumer consumer = new Consumer(sharedBuffer);
        
        producer.start();
        consumer.start();
    }
}
