package mentorship.roadmap.Java_Core.step8_Multithereading.topic8_Deadlock;

public class DeadlockDemo {

  private static Object lock1 = new Object();

  private static Object lock2 = new Object();

  public static void main(String[] args) {
    Thread thread1 = new Thread(() -> {
      synchronized (lock1) {
        System.out.println("Захвачен монитор lock1 потоком: " + Thread.currentThread().getName());
        try {
          Thread.sleep(50);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
        synchronized (lock2) {
          System.out.println("Захвачен монитор lock1 потоком: " + Thread.currentThread().getName());
        }
      }
    });
    Thread thread2 = new Thread(() -> {
      synchronized (lock2) {
        System.out.println("Захвачен монитор lock2 потоком: " + Thread.currentThread().getName());
        try {
          Thread.sleep(50);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
        synchronized (lock1) {
          System.out.println("Захвачен монитор lock1 потоком: " + Thread.currentThread().getName());
        }
      }
    });
    thread1.start();
    thread2.start();
  }
}
