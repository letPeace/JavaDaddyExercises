package mentorship.roadmap.step_2_core.step2.arrays.CountOccurrences;

public class CountOccurrences {

    public static void main(String[] args) {
        int[] arr = {5, 2, 5, 3, 5, 7, 5};
        int count = 0;
        int target = 5;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        System.out.println("Число " + target + " встречается " + count + " раз(а).");
    }
}
