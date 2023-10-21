package ua.com.itvdn.javaessencial.students.maks.lecture0.task3;

/*
Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Rectangle. В теле класса
создать два поля, описывающие длины сторон double side1, double side2. Создать два метода,
вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2) и периметр
прямоугольника – double perimeterCalculator (double side1, double side2). Написать программу, которая
принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и
площадь
 */

public class Rectangle {
    protected double side1;
    protected double side2;

    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide1() {
        return side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public double getSide2() {
        return side2;
    }

    protected double areaCalculator (double side1, double side2){
        return side1 * side2;
    }

    protected double perimeterCalculator(double side1, double side2) {
        return (side1 + side2) * 2;
    }
}
