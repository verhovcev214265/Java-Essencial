package ua.com.itvdn.javaessencial.students.maks.lecture0.practice;

public class Car {
    private String model;
    private String color;
    private int serialNumber;
    private String engine;
    private String custom;
    private int maxSpeed;

    public Car(String model, String color, int serialNumber, String engine, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.serialNumber = serialNumber;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
    }

    public void changeColor(String newColor) {
        color = newColor;
    }
    public void customization(String custom) {
        this.custom = custom;
    }
    public void changeMaxSpeed(int newMaxSpeed) {
        maxSpeed = newMaxSpeed;
    }

    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getSerialNumber() {
        return serialNumber;
    }
    public String getEngine() {
        return engine;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public String getCustom() {
        return custom;
    }
}
