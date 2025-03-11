package mentorship.roadmap.Java_Core.step2_Base.topic4_Conditionals.task3_DayOfWeek;

public class DayOfWeek {

    public static void main(String[] args) {
        int day = 6; // пример: 6 означает субботу
        String dayName;
        String dayType;

        switch (day) {
            case 1:
                dayName = "Понедельник";
                break;
            case 2:
                dayName = "Вторник";
                break;
            case 3:
                dayName = "Среда";
                break;
            case 4:
                dayName = "Четверг";
                break;
            case 5:
                dayName = "Пятница";
                break;
            case 6:
                dayName = "Суббота";
                break;
            case 7:
                dayName = "Воскресенье";
                break;
            default:
                dayName = "Неизвестный день";
                break;
        }

        // Определяем тип дня
        if (day >= 1 && day <= 5) {
            dayType = "Рабочий день";
        } else if (day == 6 || day == 7) {
            dayType = "Выходной";
        } else {
            dayType = "";
        }

        System.out.println(dayName + " - " + dayType);
    }
}
