package mentorship.roadmap.step_2_core.step2.conditionals.task2_AgeCategory;

public class AgeCategory {

    public static void main(String[] args) {
        int age = 25; // пример возраста
        String category;

        if (age < 13) {
            category = "Ребенок";
        } else if (age <= 19) {
            category = "Подросток";
        } else if (age <= 64) {
            category = "Взрослый";
        } else {
            category = "Пожилой";
        }

        System.out.println("Возраст " + age + " относится к категории: " + category);
    }
}
