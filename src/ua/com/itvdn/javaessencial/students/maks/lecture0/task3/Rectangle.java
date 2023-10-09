package ua.com.itvdn.javaessencial.students.maks.lecture0.task3;

/*
Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Rectangle. В теле класса
создать два поля, описывающие длины сторон double side1, double side2. Создать два метода,
вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2) и периметр
прямоугольника – double perimeterCalculator (double side1, double side2). Написать программу, которая
принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и
площадь
 */

import java.util.Scanner;

public class Rectangle {
    double side1;
    double side2;

    double areaCalculator (double side1, double side2){
        return side1 * side2;
    }

    double perimeterCalculator (double side1, double side2){
        return side1 + side2; // неправильна формула, як периметер вираховується, Макс =))
    }

    public static void main(String[] args) {
         /*
        - Знов ж таки тобі треба стоворити окремий клас Rectangle, потім окремо створити клас Main в якому буде метод main
        - Потім тобі треба в main запускати методи areaCalculator та perimeterCalculator
         */
        Rectangle result = new Rectangle();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of first side:");
        result.side1 = scan.nextInt();

        System.out.println("Enter length of second side:");
        result.side2 = scan.nextInt();

        System.out.println(result.areaCalculator(result.side1, result.side2) + "\n"
                + result.perimeterCalculator(result.side1, result.side2));
    }
}
