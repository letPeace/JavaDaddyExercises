package main.java.mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task8_FizzBuzz;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 3 == 0 & number % 5 == 0){
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        }
        else{
            System.out.println("не делится ваще без остатся не на чо");
        }
    }
}
