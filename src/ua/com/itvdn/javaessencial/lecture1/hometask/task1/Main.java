package ua.com.itvdn.javaessencial.lecture1.hometask.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter your radius: ");
        Scanner scan = new Scanner(System.in);
        double input = scan.nextDouble();

        System.out.println("Area of circle = " + MyArea.areaOfCircle(input));
    }
}
