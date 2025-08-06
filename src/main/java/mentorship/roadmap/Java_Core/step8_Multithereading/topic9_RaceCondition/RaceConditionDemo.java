package mentorship.roadmap.Java_Core.step8_Multithereading.topic9_RaceCondition;

public class RaceConditionDemo {

  private static int counter = 0;

  private static int COUNTER_THREAD = 10000;

  public static void main(String[] args) {
    Runnable runnable = () -> {
      for (int i = 0; i < COUNTER_THREAD; i++) {
        counter++;
      }
    };

    Thread thread1 = new Thread(runnable);
    Thread thread2 = new Thread(runnable);

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }

    System.out.println(counter);
    Counter counter = new Counter();
    Runnable runnable2 = () -> {
      for (int i = 0; i < COUNTER_THREAD; i++) {
        counter.increment();
      }
    };

    Thread thread3 = new Thread(runnable2);
    Thread thread4 = new Thread(runnable2);

    thread3.start();
    thread4.start();

    try {
      thread3.join();
      thread4.join();
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }

    System.out.println(counter.getCounter());

  }
}
