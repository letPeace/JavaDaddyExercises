package mentorship.roadmap.step_2_core.step2.methods.EvenNumbersArray;

import java.util.Arrays;

public class EvenNumbersArray {

    public static int[] getEvenNumbers(int n) {
        int[] evens = new int[n];
        for (int i = 0; i < n; i++) {
            evens[i] = 2 * (i + 1);
        }
        return evens;
    }

    public static void main(String[] args) {
        int[] evens = getEvenNumbers(5);
        System.out.println("Первые 5 чётных чисел: " + Arrays.toString(evens));
    }
}
