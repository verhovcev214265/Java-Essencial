package ua.com.itvdn.javaessencial.lecture7_exceptions.classwork.ex6_throws;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Divider divider = new Divider();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first argument:");
        int inputFirst = scan.nextInt();

        System.out.println("Enter second argument:");
        int inputSecond = scan.nextInt();

        try {
            int result = divider.divided(inputFirst, inputSecond);
            System.out.println("result = " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scan.close();
    }

}
