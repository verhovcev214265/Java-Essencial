package ua.com.itvdn.javaessencial.lecture3.lab.task1;

public class Trapeze extends Figure{

    public static final String BLUE_TEXT = "\u001B[34m";

    double basis1;
    double basis2;
    double weight;
    double area;

    public Trapeze(double basis1, double basis2, double weight) {
        this.basis1 = basis1;
        this.basis2 = basis2;
        this.weight = weight;
    }

    @Override
    public double myArea() {
        return area = (basis1 + basis2) / 2 * weight;
    }

    @Override
    public String toString() {
        return BLUE_TEXT + "Trapezoid{" +
                "basis1 = " + basis1 +
                ", basis2 = " + basis2 +
                ", weight = " + weight +
                '}';
    }


}
