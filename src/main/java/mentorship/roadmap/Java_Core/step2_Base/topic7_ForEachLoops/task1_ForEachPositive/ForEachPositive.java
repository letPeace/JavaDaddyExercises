package mentorship.roadmap.Java_Core.step2_Base.topic7_ForEachLoops.task1_ForEachPositive;

public class ForEachPositive {

    public static void main(String[] args) {
        int[] numbers = {-3, 0, 2, -1, 5, 7, -8};
        for (int num : numbers) {
            if (num > 0) {
                System.out.println(num);
            }
        }
    }
}
