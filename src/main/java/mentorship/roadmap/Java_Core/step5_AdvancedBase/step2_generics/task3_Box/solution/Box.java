package mentorship.roadmap.Java_Core.step5_AdvancedBase.step2_generics.task3_Box.solution;

public class Box<T> {

    private T value;

    public Box() {
    }

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
