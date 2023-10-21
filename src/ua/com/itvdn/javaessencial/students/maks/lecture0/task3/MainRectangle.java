package ua.com.itvdn.javaessencial.students.maks.lecture0.task3;

import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {

        Rectangle example = new Rectangle();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first side:");
        double side1 = scan.nextDouble();
        System.out.println("Enter second side:");
        double side2 = scan.nextDouble();

        example.setSide1(side1);
        example.setSide2(side2);

        double resultOfArea = example.areaCalculator(example.getSide1(), example.getSide2());
        double resultOfPerimeter = example.perimeterCalculator(example.getSide1(), example.getSide2());

        System.out.println(resultOfArea + '\n' + resultOfPerimeter); // Наче все правильно, але виводить неправильний результат
    }
}

