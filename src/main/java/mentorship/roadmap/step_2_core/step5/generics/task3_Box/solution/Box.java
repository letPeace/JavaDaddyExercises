package mentorship.roadmap.step_2_core.step5.generics.task3_Box.solution;

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
