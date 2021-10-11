package ua.com.itvdn.javaessencial.lecture3.lab.task1;

public class RightTriangle extends Figure {

    public static final String BLUE_TEXT = "\u001B[34m";

    double weight;
    double width;
    double area;


    public RightTriangle(double weight, double width) {
        this.weight = weight;
        this.width = width;

    }

    @Override
    public double myArea() {
        return area = (weight * width) / 2;
    }

    @Override
    public String toString() {
        return BLUE_TEXT + "RightTriangle{" +
                "weight = " + weight +
                ", width = " + width +
                ", area = " + area +
                '}';
    }
}
