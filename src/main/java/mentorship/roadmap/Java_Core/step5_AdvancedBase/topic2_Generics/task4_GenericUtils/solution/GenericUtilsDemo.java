package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Generics.task4_GenericUtils.solution;

public class GenericUtilsDemo {

    public static void main(String[] args) {
        Integer maxInt = GenericUtils.max(10, 20);
        String maxString = GenericUtils.max("Apple", "Banana");
        System.out.println("Максимальное число: " + maxInt);
        System.out.println("Максимальная строка: " + maxString);
    }
}
