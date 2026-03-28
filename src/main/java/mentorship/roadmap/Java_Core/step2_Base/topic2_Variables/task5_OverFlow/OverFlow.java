package java.mentorship.roadmap.Java_Core.step2_Base.topic2_Variables.task5_OverFlow;

public class OverFlow {
    public OverFlow() {
    }

    public static void main(String[] args) {
        byte a = 127;
        short b = (short)a;
        ++b;
        System.out.println("" + a + ", " + b);
    }
}
