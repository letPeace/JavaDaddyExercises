package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Statics.task1_Counter.solution;

public class CounterDemo {

    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        System.out.println("Количество созданных объектов: " + Counter.getCount());
    }
}
