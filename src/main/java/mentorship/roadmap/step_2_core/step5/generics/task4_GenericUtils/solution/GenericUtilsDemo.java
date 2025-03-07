package mentorship.roadmap.step_2_core.step5.generics.task4_GenericUtils.solution;

public class GenericUtilsDemo {

    public static void main(String[] args) {
        Integer maxInt = GenericUtils.max(10, 20);
        String maxString = GenericUtils.max("Apple", "Banana");
        System.out.println("Максимальное число: " + maxInt);
        System.out.println("Максимальная строка: " + maxString);
    }
}
