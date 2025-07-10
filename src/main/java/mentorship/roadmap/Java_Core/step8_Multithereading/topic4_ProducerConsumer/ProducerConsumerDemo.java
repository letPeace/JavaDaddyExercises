package mentorship.roadmap.Java_Core.step8_Multithereading.topic4_ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerDemo {

  private static int MAX = 5;

  private static final List<Integer> buffer = new ArrayList<>();

  public static void main(String[] args) {

    Thread producer = new Thread(() -> {
      int value = 0;
      while (true) {
        synchronized (buffer) {
          while (buffer.size() == MAX) {
            try {
              buffer.wait();
            } catch (InterruptedException interruptedException) {
              Thread.currentThread().interrupt();
            }
          }
          buffer.add(value);
          System.out.println("Producer: " + value);
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
              Thread.currentThread().interrupt();
            }
          }
          int value = buffer.removeFirst();
          System.out.println("Consumer: " + value);
          buffer.notifyAll();
        }
      }
    });

    producer.start();
    consumer.start();
  }


}
