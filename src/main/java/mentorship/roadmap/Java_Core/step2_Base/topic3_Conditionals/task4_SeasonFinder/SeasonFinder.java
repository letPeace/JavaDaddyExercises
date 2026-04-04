package main.java.mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task4_SeasonFinder;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args){
        System.out.println("Введите номер месяца: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number){
            case 12, 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
