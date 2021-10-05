package ua.com.itvdn.javaessencial.lecture0.hometask.task1;

//: Создать класс с именем Rectangle. В теле класса
//создать два поля, описывающие длины сторон double side1, double side2. Создать два метода,
//вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2) и периметр
//прямоугольника – double perimeterCalculator (double side1, double side2). Написать программу, которая
//принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и
//площадь.

public class Rectangle {

    private double size1;
    private double size2;
    private double area;
    private double perimeter;

    public Rectangle(double size1, double size2) {
        this.size1 = size1;
        this.size2 = size2;

    }

    public double areaCalculator(double size1, double size2){
        return area = size1 * size2;
    }

    public double perimeterCalculator (double side1, double side2){
       return perimeter = (side1 + side2) * 2;
    }



    @Override
    public String toString() {
        return "Rectangle{" +
                "size1 = " + size1 +
                ", size2 = " + size2 +
                ", area = " + area +
                ", perimeter = " + perimeter +
                '}';
    }
}
