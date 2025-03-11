package mentorship.roadmap.Java_Core.step8_Multithereading.task1_MyThread.solution;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread " + getName() + " says: Hello from thread!");
    }
}