package ua.com.itvdn.javadepth.lecture0.ex10_comparator_with_static;

import java.util.Comparator;

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

    static class BySpeed implements Comparator<Car> {
        @Override
        public int compare(Car carA, Car carB) {
            return carA.speed - carB.speed;
        }
    }

    static class ByPrice implements Comparator<Car> {
        @Override
        public int compare(Car carA, Car carB) {
            return carA.price - carB.price;
        }
    }

    static class ByColor implements Comparator<Car> {
        @Override
        public int compare(Car carA, Car carB){
            return carA.color.compareTo(carB.color);
        }
    }
}
