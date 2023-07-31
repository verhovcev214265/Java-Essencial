package ua.com.itvdn.javaessencial.lecture6.classwork.enums.ex2_switch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter your day: ");

        Scanner sc = new Scanner(System.in);
        String input = sc.next().toUpperCase();

        Day day = Day.valueOf(input);

        switch (day){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println(day.name().toLowerCase() + " working day");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println(day.name() + " day off");
                break;
            default:
                System.out.println("The weekday is - " + day); // ?
        }
    }
}
