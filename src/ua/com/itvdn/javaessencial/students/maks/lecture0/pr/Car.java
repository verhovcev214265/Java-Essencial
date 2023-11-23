package ua.com.itvdn.javaessencial.students.maks.lecture0.pr;

public class Car {
    private String model;
    private String color;
    private int serialNumber;
    private String engine;
    private String owner;
    private int maxSpeed;

    public void setModel(String model) {
        this.model = model;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public void setSerialNumber (int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void setOwner(String owner) {
        this.owner = owner;
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
    public String getOwner() {
        return owner;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }
    public void changeMaxSpeed(int newMaxSpeed) {
        maxSpeed = newMaxSpeed;
    }
    public void changeOwner(String newOwner) {
        owner = newOwner;
    }

    @Override
    public String toString(){ //!
        return "Car model: " + this.model +
                "\n" + "Car color: " + this.color +
                "\n" + "Car serial number: " + this.serialNumber +
                "\n" + "Car type of engine: " + this.engine +
                "\n" + "Car max speed: " + this.maxSpeed +
                "\n" + "Car owner: " + this.owner + "\n";
    }
}
