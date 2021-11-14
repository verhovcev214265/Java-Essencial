package tests.superclass.object.equals;

import tests.superclass.object.equals.Car;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(5);
        Car car2 = new Car(5);
        Car car3 = car1;

        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));

    }
}
