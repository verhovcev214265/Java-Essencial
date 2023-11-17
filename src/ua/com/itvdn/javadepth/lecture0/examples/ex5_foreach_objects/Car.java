package ua.com.itvdn.javadepth.lecture0.examples.ex5_foreach_objects;

public class Car {
    String model;
    int price;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String toString(){
        return "Car: model - " + model + ", price = " + price + ".";
    }
}
