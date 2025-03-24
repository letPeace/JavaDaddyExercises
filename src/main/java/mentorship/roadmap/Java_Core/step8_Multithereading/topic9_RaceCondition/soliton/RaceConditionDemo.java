package mentorship.roadmap.Java_Core.step8_Multithereading.topic9_RaceCondition.soliton;

public class RaceConditionDemo {
    private static int count = 0;

    public static void main(String[] args) {
        int numberOfThreads = 10;
        int incrementsPerThread = 1000;
        Thread[] threads = new Thread[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < incrementsPerThread; j++) {
                    // Увеличение без синхронизации — может возникнуть race condition
                    count++;
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

        System.out.println("Итоговое значение счётчика (без синхронизации): " + count);
    }
}
