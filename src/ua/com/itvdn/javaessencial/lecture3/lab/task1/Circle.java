package ua.com.itvdn.javaessencial.lecture3.lab.task1;

public class Circle extends Figure{

    public static final String BLUE_TEXT = "\u001B[34m";

    double PI = 3.14;
    double radius;
    double area;

    public Circle(double PI,double radius) {
        this.PI = PI;
        this.radius = radius;
    }

    @Override
    public double myArea() {
        return area = PI * (radius * radius);
    }

    @Override
    public String toString() {
        return BLUE_TEXT + "Circle{" +
                "PI = " + PI +
                ", radius = " + radius +
                ", area = " + area +
                '}';
    }
}
