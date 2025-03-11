package mentorship.roadmap.Java_Core.step2_Base.methods.task4_MinMaxFinder;

public class MinMaxFinder {
    public static int[] findMinMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new int[]{0, 0};
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] data = {7, 3, 9, 2, 5};
        int[] result = findMinMax(data);
        System.out.println("Минимум: " + result[0] + ", Максимум: " + result[1]);
    }
}
