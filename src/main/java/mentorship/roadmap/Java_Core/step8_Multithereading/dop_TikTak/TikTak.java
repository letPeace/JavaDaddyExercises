package mentorship.roadmap.Java_Core.step8_Multithereading.dop_TikTak;

// Доп задание которое я нашёл с собеседования выводить последовательно сначало Tik потом Tak бесконечно

public class TikTak {

  private static Object lock = new Object();

  public static void main(String[] args) {
    Thread threadTik = new Thread(() -> {
      synchronized (lock) {
        while (true) {
          System.out.println("Tik");
          try {
            Thread.sleep(1000);
            lock.wait();
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
          lock.notifyAll();
        }
      }
    });
    Thread threadTak = new Thread(() -> {
      synchronized (lock) {
        while (true) {
          System.out.println("Tak");
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
          lock.notifyAll();
          try {
            lock.wait();
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
        }
      }
    });
  threadTik.start();
  threadTak.start();


  }
}
