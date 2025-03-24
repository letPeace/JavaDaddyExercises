package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic4_Enums.task5_Operation.solution;

public class OperationDemo {

    public static void main(String[] args) {
        double a = 12.0, b = 3.0;
        for (Operation op : Operation.values()) {
            System.out.printf("%s: %f\n", op, op.apply(a, b));
        }
    }
}
