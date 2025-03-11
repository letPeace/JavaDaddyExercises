package mentorship.roadmap.Java_Core.step8_Multithereading.task7_ThreadLocal.solution;

public class ThreadLocalDemo {
    // Объявляем ThreadLocal переменную, инициализируем начальным значением 0
    private static final ThreadLocal<Integer> threadCounter = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {
        // Создадим несколько потоков
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                threadCounter.set(threadCounter.get() + 1);
            }
            System.out.println("Поток " + Thread.currentThread().getName() +
                    " имеет счетчик: " + threadCounter.get());
        };

        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");
        Thread t3 = new Thread(task, "T3");

        t1.start();
        t2.start();
        t3.start();
    }
}
