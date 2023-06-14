package ua.com.itvdn.javaessencial.lecture3.classwork.abstractclasses.ex6_Array_Objects;

public abstract class Car {

    private String model;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    abstract String engine();
}
