package mentorship.roadmap.Java_Core.step2_Base.step2_variables.task3_SwapValues;

public class SwapValues {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("До обмена: a = " + a + ", b = " + b);

        // Обмен значениями
        int temp = a;
        a = b;
        b = temp;

        System.out.println("После обмена: a = " + a + ", b = " + b);
    }
}