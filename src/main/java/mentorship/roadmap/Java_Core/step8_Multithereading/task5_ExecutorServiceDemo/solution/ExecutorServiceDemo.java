package mentorship.roadmap.Java_Core.step8_Multithereading.task5_ExecutorServiceDemo.solution;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            final int taskNumber = i;
            executor.submit(() -> {
                System.out.println("Task " + taskNumber + " выполняется в " + Thread.currentThread().getName());
                try {
                    Thread.sleep(500); // имитация работы
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.shutdown();
        try {
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                System.out.println("Не все задачи завершились вовремя.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Все задачи выполнены.");
    }
}
