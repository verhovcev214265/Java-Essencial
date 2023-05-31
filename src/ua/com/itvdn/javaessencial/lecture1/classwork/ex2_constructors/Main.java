package ua.com.itvdn.javaessencial.lecture1.classwork.ex2_constructors;

public class Main {
    public static void main(String[] args) {

        Car car_A = new Car();

        Car car_B = new Car("BMW", 230);

        Car car_C = new Car("Audi", 213, "green");

        System.out.println(car_A + "\n" +
                car_B.getModel() + ", " + car_B.getSpeed() + "\n" +
                car_C.getModel() + ", " + car_C.getSpeed() + ", " + car_C.getColor());

    }
}
