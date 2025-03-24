package mentorship.roadmap.Java_Core.step2_Base.topic3_String.task3_StringPoolDemo;

public class StringPoolDemo {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";

        System.out.println("s1 == s2: " + (s1 == s2)); // true, так как оба ссылаются на один объект в пуле
    }
}
