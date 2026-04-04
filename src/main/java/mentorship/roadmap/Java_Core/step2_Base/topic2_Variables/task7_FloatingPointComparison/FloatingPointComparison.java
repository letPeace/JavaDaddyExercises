package java.mentorship.roadmap.Java_Core.step2_Base.topic2_Variables.task7_FloatingPointComparison;

public class FloatingPointComparison {
    public FloatingPointComparison() {
    }

    public static void main(String[] args) {
        double a = 3.14;
        double b = 3.15;
        boolean d = a == b;
        boolean c = Math.abs(a - b) < 1.0E-6;
        System.out.println(d);
        System.out.println(c);
    }
}