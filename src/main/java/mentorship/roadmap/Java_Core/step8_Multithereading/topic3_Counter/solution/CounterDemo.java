package mentorship.roadmap.Java_Core.step8_Multithereading.topic3_Counter.solution;

public class CounterDemo {
    public static void main(String[] args) {
        final Counter counter = new Counter();
        int numberOfThreads = 5;
        int incrementsPerThread = 1000;

        Thread[] threads = new Thread[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < incrementsPerThread; j++) {
                    counter.increment();
                }
            });
            threads[i].start();
        }

        for (int i = 0; i < numberOfThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Итоговое значение счётчика: " + counter.getCount());
    }
}
