package ua.com.itvdn.javadepth.lecture0.ex9_comparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        Car[] cars = new Car[]{
                new Car(200, 8000, "BMW", "Black"),
                new Car(140, 2000, "Mercedes", "White"),
                new Car(200, 10000, "Reno", "Blue")
        };

        Arrays.sort(cars, new BySpeed());
        for (Car sortBySpeed : cars){
            System.out.println(sortBySpeed);
        }
        System.out.println("------------------------------------------------------------------------------------------");

        Arrays.sort(cars, new ByPrice());
        for(Car sortByPrice : cars){
            System.out.println(sortByPrice);
        }
        System.out.println("------------------------------------------------------------------------------------------");

        Arrays.sort(cars, new ByColor());
        for(Car sortByColor : cars){
            System.out.println(sortByColor);
        }
        System.out.println("------------------------------------------------------------------------------------------");
    }
}
