package ua.com.itvdn.javaessencial.lecture1.classwork.ex1_constructors;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        car.setModel("BMW");
        car.setSpeed(220);

        System.out.println("Model: " + car.getModel() + ", speed = " + car.getSpeed());

    }
}
