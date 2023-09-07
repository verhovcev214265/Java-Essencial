package ua.com.itvdn.javaessencial.lecture8_object.classwork.ex5_equals_overriden;

public class Main {
    public static void main(String[] args) {
        Bus busA = new Bus(200);
        Bus busB = new Bus(200);
        Bus busC = busA;

        System.out.println(
                busA.equals(busB) + "\n" +
                        busA.equals(busC) + "\n" +
                        "-------------------------------------\n" +
                        (busA == busB) + "\n" +
                        (busA == busC)
        );
    }

}
