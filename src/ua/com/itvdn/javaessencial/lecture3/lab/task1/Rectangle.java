package ua.com.itvdn.javaessencial.lecture3.lab.task1;

public class Rectangle extends Figure{

    int weight;
    int width;

    @Override
    public int myArea(int weight, int width ) {
        return weight * width;

    }
}
