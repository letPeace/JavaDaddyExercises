package mentorship.roadmap.Java_Core.step8_Multithereading.topic3_Counter;

import java.util.stream.IntStream;

public class CounterDemo {

  private static int incrementAmount = 1000;

  private static int incrementAmount2 = 10000;

  public static void main(String[] args) {
    Counter counter = new Counter();
    Thread thread1 = new Thread(() -> IntStream.range(0, incrementAmount).forEach(i -> counter.increment()));
    Thread thread2 = new Thread(() -> IntStream.range(0, incrementAmount2).forEach(i -> counter.increment()));
    thread1.start();
    thread2.start();
    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(counter.getCount());
  }
}
