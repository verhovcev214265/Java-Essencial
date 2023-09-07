package ua.com.itvdn.javaessencial.lecture8_object.classwork.ex2_toString_getClass;

public class Main {
    public static void main(String[] args) {

        Colors colors = Colors.BLACK;
        Car bmw = new Car(colors.getColor(), 220);

        System.out.println(bmw.getClass() + "\n------------------------------------------------\n" + bmw);
    }
}
