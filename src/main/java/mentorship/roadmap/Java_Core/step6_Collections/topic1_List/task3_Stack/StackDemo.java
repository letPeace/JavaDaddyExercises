package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task3_Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println("Верхний элемент: " +stack.peek());

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }



    }
}
