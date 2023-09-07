package ua.com.itvdn.javaessencial.lecture8_object.classwork.ex3_equals;

public class Main {
    public static void main(String[] args) {

        Car carA = new Car(1000);
        Car carB = new Car(1000);
        Car carC = carA;

        System.out.println(
                carA.equals(carB) + "\n" +
                carA.equals(carC)
        );
        System.out.println(carA == carB);
        System.out.println(carA == carC);
    }
}
