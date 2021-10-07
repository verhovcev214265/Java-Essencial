package ua.com.itvdn.javaessencial.lecture1.hometask.task3;

public class Car {

    private int yearProduction;
    private double speed;
    private int weight; // kg
    Color color;

    public Car(){

    }

    public Car(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public Car(int yearProduction, double speed) {
        this.yearProduction = yearProduction;
        this.speed = speed;
    }

    public Car(int yearProduction, double speed, int weight) {
        this.yearProduction = yearProduction;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int yearProduction, double speed, int weight, Color color) {
        this.yearProduction = yearProduction;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearProduction=" + yearProduction +
                ", speed=" + speed +
                ", weight=" + weight +
                ", color=" + color +
                '}';
    }
}
