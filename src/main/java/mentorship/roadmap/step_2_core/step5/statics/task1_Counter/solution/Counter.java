package mentorship.roadmap.step_2_core.step5.statics.task1_Counter.solution;

public class Counter {

    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
