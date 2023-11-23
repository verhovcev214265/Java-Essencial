package ua.com.itvdn.javadepth.lecture0.ex11_comparator_with_anonimuous;

public class Car {
    int speed;
    int price;
    String model;
    String color;

    public Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car: " +
                "model - " + this.model + ", color - " + this.color + ", speed = " + this.speed + ", price = " + this.price;
    }
}
