package ua.com.itvdn.javaessencial.lecture1.hometask.task2;

public class Car {
    private int yearProduction;
    Color color;

    public Car(){

    }

    public Car(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public Car(int yearProduction, Color color) {
        this.yearProduction = yearProduction;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearProduction = " + yearProduction +
                ", color = " + color +
                '}';
    }
}
