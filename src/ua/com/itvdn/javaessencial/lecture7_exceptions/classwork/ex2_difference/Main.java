package ua.com.itvdn.javaessencial.lecture7_exceptions.classwork.ex2_difference;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first = scan.nextInt();

        System.out.println("Enter second number: ");
        int second = scan.nextInt();

        // without try-catch
        if (second != 0) System.out.println(first / second);
        else System.out.println("Due you mustn't divide by zero ");

        // with try-catch
        try {
            System.out.println(first / second);
        }catch (ArithmeticException e){
            System.out.println("Due you mustn't divide by zero ");
        }

        scan.close();
    }
}
