package ua.com.itvdn.javaessencial.lecture1.classwork.ex2_constructors;

public class Car {

    private String model;
    private int speed;
    private String color;

    public Car(){}

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public Car(String model){
        this(model, 200);
    }

    public Car(String model, int speed, String color) {
        this(model, speed); // first write
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }
}
