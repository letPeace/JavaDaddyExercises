package mentorship.roadmap.step_2_core.step5.statics.task3_Config.solution;

public class Config {

    private static String configVersion;

    static {
        // Инициализация статической переменной в статическом блоке
        configVersion = "v1.0.0";
    }

    public static void displayConfig() {
        System.out.println("Конфигурация: " + configVersion);
    }
}
