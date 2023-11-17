package ua.com.itvdn.javadepth.lecture0.examples.ex11_comparator_with_anonimuous;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[]{
                new Car(201, 8000, "BMW", "Black"),
                new Car(140, 2000, "Mercedes", "White"),
                new Car(200, 10000, "Reno", "Yellow")
        };

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car carA, Car carB) {
                return carA.price - carB.price;
            }
        });
        for (Car car : cars) System.out.println(car);


        System.out.println("-----------------------------------------------------------------------------------------");

        Arrays.sort(cars, (carA, carB) -> carA.speed - carB.speed);
        for (Car car : cars) System.out.println(car);

        System.out.println("-----------------------------------------------------------------------------------------");

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car carA, Car carB) {
                return carA.color.compareTo(carB.color);
            }
        });
        for (Car car : cars) System.out.println(car);

    }
}
