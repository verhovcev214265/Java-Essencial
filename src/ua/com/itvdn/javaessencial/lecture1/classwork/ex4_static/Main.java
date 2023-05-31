package ua.com.itvdn.javaessencial.lecture1.classwork.ex4_static;

public class Main {
    public static void main(String[] args) {

        Car carA = new Car();
        Car carB = new Car();
        Car carC = new Car();

        System.out.println(Car.getCount());

        carA.showCount_A();
        carB.showCount_A();
        carC.showCount_A();

        Car.showCount_B();

    }
}
