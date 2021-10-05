package ua.com.itvdn.javaessencial.lecture0.hometask.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter length: ");

        Scanner scan = new Scanner(System.in);
        double inputLength = scan.nextDouble();

        System.out.println("Enter width : ");
        double inputWidth = scan.nextDouble();

        Rectangle rectangle = new Rectangle(inputLength,inputWidth);
        rectangle.areaCalculator(inputLength,inputWidth);
        rectangle.perimeterCalculator(inputLength,inputWidth);
        System.out.println(rectangle);

    }
}
