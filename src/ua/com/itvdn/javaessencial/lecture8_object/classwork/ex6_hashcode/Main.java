package ua.com.itvdn.javaessencial.lecture8_object.classwork.ex6_hashcode;

public class Main {
    public static void main(String[] args) {
        Bus busA = new Bus(200);
        Bus busB = new Bus(200);
        Bus busC = new Bus(201);

        System.out.println(
                busA.hashCode() + "\n" +
                        busB.hashCode() + "\n" +
                        busC.hashCode()
        );
    }
}
