package mentorship.roadmap.Java_Core.step8_Multithereading.task6_Interrupt.solution;

public class InterruptDemo {
    public static void main(String[] args) {
        Thread worker = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Работаю...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // Если во время сна происходит прерывание,
                    // то устанавливаем флаг прерывания и выходим из цикла.
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Поток завершён.");
        });

        worker.start();

        // Основной поток ждёт 3 секунды и затем прерывает рабочий поток.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        worker.interrupt();
    }
}
