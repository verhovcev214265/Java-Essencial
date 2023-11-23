package ua.com.itvdn.javadepth.lecture0.ex8_sorting_with_comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[]{
                new Car(200, 8000, "BMW", "Black"),
                new Car(140, 2000, "Mercedes", "White"),
                new Car(200, 10000, "Reno", "Blue")
        };
        Arrays.sort(cars);

        for (Car car : cars){
            System.out.println(car);
        }
    }
}
