package mentorship.roadmap.step_2_core.step5.statics.task1_Counter.solution;

public class CounterDemo {

    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        System.out.println("Количество созданных объектов: " + Counter.getCount());
    }
}
