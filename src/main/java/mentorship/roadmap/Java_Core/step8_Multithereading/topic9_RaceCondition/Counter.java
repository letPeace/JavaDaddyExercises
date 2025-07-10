package mentorship.roadmap.Java_Core.step8_Multithereading.topic9_RaceCondition;

public class Counter {
  private int counter = 0;

  public synchronized void increment() {
    counter++;
  }

  public int getCounter() {
    return counter;
  }
}
