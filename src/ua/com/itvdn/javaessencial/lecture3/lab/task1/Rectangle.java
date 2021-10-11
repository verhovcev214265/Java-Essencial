package ua.com.itvdn.javaessencial.lecture3.lab.task1;

public class Rectangle extends Figure{

    public static final String BLUE_TEXT = "\u001B[34m";

    double weight;
    double width;
    double area;

    public Rectangle(double weight, double width) {
        this.weight = weight;
        this.width = width;
    }

    @Override
    public double myArea() {
        return area = weight * width;
    }

    @Override
    public String toString() {
        return BLUE_TEXT + "Rectangle{" +
                "weight = " + weight +
                ", width = " + width +
                ", area = " + area +
                '}';
    }
}
