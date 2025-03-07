package mentorship.roadmap.step_2_core.step2.conditionals.task4_SeasonFinder;

public class SeasonFinder {

    public static void main(String[] args) {
        int month = 4; // пример: апрель
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
            default:
                season = "Неверный номер месяца";
        }

        System.out.println("Сезон: " + season);
    }
}
