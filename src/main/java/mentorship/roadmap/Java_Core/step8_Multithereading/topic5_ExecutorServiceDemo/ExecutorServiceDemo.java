package mentorship.roadmap.Java_Core.step8_Multithereading.topic5_ExecutorServiceDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {
  private static int COUNT_THREADS = 3;
  public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(3);
    for (int i = 0; i < COUNT_THREADS; i++) {
      int finalI = i;
      executor.submit(() -> System.out.println("Task " + finalI + ": " + Thread.currentThread().getName()));
    }
    executor.shutdown();
    try {
      executor.awaitTermination(20, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }
}
