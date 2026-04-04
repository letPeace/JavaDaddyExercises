package main.java.mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task3_DayOfWeek;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args){
        System.out.println("Введите день недели: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Неверный день!");
        }

        if (number <= 5){
            System.out.println("Рабочий день!");
        } else if (number == 6 || number == 7){
            System.out.println("Выходной день!");
        }
    }
}