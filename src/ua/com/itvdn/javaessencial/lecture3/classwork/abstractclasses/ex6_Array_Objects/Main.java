package ua.com.itvdn.javaessencial.lecture3.classwork.abstractclasses.ex6_Array_Objects;

public class Main {
    public static void main(String[] args) {


        Car[] cars = new Car[2];
        cars[0] = new BMW("X6", 310);
        cars[1] = new Opel("Cadet", 220);

        for (Car car : cars) {
            System.out.println(car.getModel() + " engine = " + car.engine());
        }
    }
}
