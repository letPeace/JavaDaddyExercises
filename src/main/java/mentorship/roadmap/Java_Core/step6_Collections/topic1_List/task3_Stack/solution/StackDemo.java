package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task3_Stack.solution;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        // Добавляем элементы в стек
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        // Просмотр верхнего элемента без удаления
        System.out.println("Верхний элемент (peek): " + stack.peek());

        // Извлечение элементов
        while (!stack.isEmpty()) {
            System.out.println("Извлечён элемент: " + stack.pop());
        }
    }
}