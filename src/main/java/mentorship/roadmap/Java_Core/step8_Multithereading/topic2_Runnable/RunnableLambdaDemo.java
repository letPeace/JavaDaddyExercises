package mentorship.roadmap.Java_Core.step8_Multithereading.topic2_Runnable;

public class RunnableLambdaDemo {
  public static void main(String[] args) {
    Runnable runnable = () -> System.out.println("Task 2 is running");
    Runnable runnable2 = () -> System.out.println("Task 2.1 is running");
    Thread thread1 = new Thread(runnable);
    Thread thread2 = new Thread(runnable2);
    thread1.start();
    thread2.start();
    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
