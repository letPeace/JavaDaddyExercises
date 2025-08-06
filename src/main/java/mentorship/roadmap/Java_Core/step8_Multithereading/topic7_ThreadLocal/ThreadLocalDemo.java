package mentorship.roadmap.Java_Core.step8_Multithereading.topic7_ThreadLocal;

public class ThreadLocalDemo {
  private static int COUNTER_THREAD = 100;
  public static void main(String[] args) {
    ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 0);
    Runnable runnable = () -> {
      for (int i = 0; i < COUNTER_THREAD; i++) {
        threadLocal.set(threadLocal.get() + 1);
      }
      System.out.println("Поток " + Thread.currentThread().getName() + " его счётчик равен " + threadLocal.get());
    };
    Thread thread1 = new Thread(runnable);
    Thread thread2 = new Thread(runnable);
    thread1.start();
    thread2.start();
    threadLocal.remove();
  }
}
