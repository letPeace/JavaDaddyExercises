package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Statics.task1_Counter.solution;

public class Counter {

    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
