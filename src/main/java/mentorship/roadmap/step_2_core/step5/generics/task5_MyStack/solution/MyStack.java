package mentorship.roadmap.step_2_core.step5.generics.task5_MyStack.solution;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {

    private List<T> elements = new ArrayList<>();

    public void push(T element) {
        elements.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return elements.remove(elements.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
