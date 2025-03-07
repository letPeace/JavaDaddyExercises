package mentorship.roadmap.step_2_core.step2.arrays.ReverseArray;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
