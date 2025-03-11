package mentorship.roadmap.step_2_core.step5.generics.task3_Box.solution;

public class BoxDemo {

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, Generics!");
        System.out.println("Содержимое stringBox: " + stringBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println("Содержимое intBox: " + intBox.get());
    }
}
