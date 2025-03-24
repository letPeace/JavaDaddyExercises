package mentorship.roadmap.Java_Core.step8_Multithereading.topic8_Deadlock.solution;

public class DeadlockDemo {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Поток T1: захвачен lock1");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                }
                synchronized (lock2) {
                    System.out.println("Поток T1: захвачен lock2");
                }
            }
        }, "T1");

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Поток T2: захвачен lock2");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                }
                synchronized (lock1) {
                    System.out.println("Поток T2: захвачен lock1");
                }
            }
        }, "T2");

        t1.start();
        t2.start();
    }
}
