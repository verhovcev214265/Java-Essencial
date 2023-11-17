package ua.com.itvdn.javadepth.lecture0.examples.ex7_sorting_without_comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {7, 8, 9, 3, -10, 43};
        Arrays.sort(numbers);

        String[] names = {"Alex", "Edward", "Evgeniy", "Karina"};
        Arrays.sort(names);

        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) System.out.print(numbers[i] + ", ");
            else System.out.println(numbers[i] + ".\n");
        }

        for (int i = 0; i < names.length; i++) {
            if (i < names.length - 1) System.out.print(names[i] + ", ");
            else System.out.print(names[i] + ".");
        }

        Car[] cars = new Car[]{
                new Car(190, 8000, "BMW", "Black"),
                new Car(140, 2000, "Mercedes", "White"),
                new Car(185, 10000, "Reno", "Blue")
        };

        Arrays.sort(cars); // ClassCastException

    }
}
