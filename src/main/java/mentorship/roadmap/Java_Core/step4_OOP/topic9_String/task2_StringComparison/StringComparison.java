package mentorship.roadmap.Java_Core.step4_OOP.topic9_String.task2_StringComparison;

public class StringComparison {

    public static void main(String[] args) {
        String str1 = "Test";
        String str2 = new String("Test");

        System.out.println("Сравнение через '==': " + (str1 == str2)); // false
        System.out.println("Сравнение через 'equals()': " + str1.equals(str2)); // true
    }
}
