package mentorship.roadmap.step_2_core.step2.string.StringPoolDemo;

public class StringPoolDemo {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";

        System.out.println("s1 == s2: " + (s1 == s2)); // true, так как оба ссылаются на один объект в пуле
    }
}
