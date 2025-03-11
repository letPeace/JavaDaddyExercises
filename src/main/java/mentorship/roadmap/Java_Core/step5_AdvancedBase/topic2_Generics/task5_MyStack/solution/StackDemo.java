package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Generics.task5_MyStack.solution;

public class StackDemo {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        stack.push("Первый");
        stack.push("Второй");
        stack.push("Третий");

        System.out.println("Верхний элемент: " + stack.peek());
        while (!stack.isEmpty()) {
            System.out.println("Извлечено: " + stack.pop());
        }
    }
}
