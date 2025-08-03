package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task3_Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> demoStack = new Stack<>();
        demoStack.push("First");
        demoStack.push("Second");
        demoStack.push("Third");
        System.out.println(demoStack.peek());

        while(!demoStack.isEmpty()){
            System.out.println(demoStack.pop());
        }
    }
}
