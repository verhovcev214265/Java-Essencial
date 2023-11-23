package ua.com.itvdn.javaessencial.students.maks.lecture0.practice;

public class Car {
    private String model;
    private String color;
    private int serialNumber;
    private String engine;
    private String custom;
    private int maxSpeed;

    public Car(){}

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

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString(){
        return "Car: model - " + this.model + ", color - " + this.color + ", serial number - " + this.serialNumber +
                ", engine - " + this.engine + ", max speed = " + this.maxSpeed + ".";
    }
}
