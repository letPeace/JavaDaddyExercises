package mentorship.roadmap.Java_Core.step8_Multithereading.topic6_Interrupt;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class InterruptDemo {
  public static void main(String[] args) {
    Thread thread = new Thread(() -> {
      while (true) {
        if (Thread.currentThread().isInterrupted()) {
          break;
        }
        System.out.println("Работаю...");
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }
    });
    thread.start();
    try {
      TimeUnit.SECONDS.sleep(3);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
    thread.interrupt();
  }


}
