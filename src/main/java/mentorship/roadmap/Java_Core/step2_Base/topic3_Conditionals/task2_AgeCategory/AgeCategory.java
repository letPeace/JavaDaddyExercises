package mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task2_AgeCategory;

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
