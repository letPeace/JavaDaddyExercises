package mentorship.roadmap.Java_Core.step2_Base.topic4_Conditionals.task6_PositiveCheckTernary;

public class PositiveCheckTernary {

    public static void main(String[] args) {
        int number = -5; // пример числа
        String result = (number > 0) ? "Положительное" : "Нулевое или отрицательное";
        System.out.println("Число " + number + " является " + result);
    }
}
