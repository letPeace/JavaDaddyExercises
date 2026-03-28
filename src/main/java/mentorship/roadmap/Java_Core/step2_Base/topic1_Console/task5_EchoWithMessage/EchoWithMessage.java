package java.mentorship.roadmap.Java_Core.step2_Base.topic1_Console.task5_EchoWithMessage;

import java.util.Scanner;

public class EchoWithMessage {
    public EchoWithMessage() {
    }

    public static void main(String[] args) {
        System.out.println("Enter your text: ");
        Scanner myScanner = new Scanner(System.in);
        String text = myScanner.nextLine();
        System.out.println("You entered: '" + text + "' Thank you!");
    }
}

