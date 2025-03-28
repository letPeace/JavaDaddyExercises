package mentorship.roadmap.Java_Core.step4_OOP.topic10_Statics.task3_Config.solution;

public class Config {

    private static final String configVersion;

    static {
        // Инициализация статической переменной в статическом блоке
        configVersion = "v1.0.0";
    }

    public static void displayConfig() {
        System.out.println("Конфигурация: " + configVersion);
    }
}
