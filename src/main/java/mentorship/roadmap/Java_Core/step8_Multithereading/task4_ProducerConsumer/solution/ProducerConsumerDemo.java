package mentorship.roadmap.Java_Core.step8_Multithereading.task4_ProducerConsumer.solution;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumerDemo {
    private static final int CAPACITY = 5;
    private static final List<Integer> buffer = new LinkedList<>();

    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            int value = 0;
            while (true) {
                synchronized (buffer) {
                    while (buffer.size() == CAPACITY) {
                        try {
                            buffer.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    buffer.add(value);
                    System.out.println("Produced: " + value);
                    value++;
                    buffer.notifyAll();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            while (true) {
                synchronized (buffer) {
                    while (buffer.isEmpty()) {
                        try {
                            buffer.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int val = buffer.remove(0);
                    System.out.println("Consumed: " + val);
                    buffer.notifyAll();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
