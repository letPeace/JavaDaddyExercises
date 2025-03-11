package mentorship.roadmap.Java_Core.step8_Multithereading.task3_Counter.solution;

public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
