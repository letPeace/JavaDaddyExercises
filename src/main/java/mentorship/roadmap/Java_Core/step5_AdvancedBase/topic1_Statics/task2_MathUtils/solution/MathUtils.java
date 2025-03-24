package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Statics.task2_MathUtils.solution;

public class MathUtils {

    // Приватный конструктор предотвращает создание экземпляров
    private MathUtils() {
    }

    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }
}
