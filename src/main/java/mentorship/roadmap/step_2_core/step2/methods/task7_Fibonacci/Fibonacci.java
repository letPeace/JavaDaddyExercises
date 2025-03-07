package mentorship.roadmap.step_2_core.step2.methods.task7_Fibonacci;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(n + "-е число Фибоначчи: " + fibonacci(n));
    }
}
