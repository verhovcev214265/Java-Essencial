package ua.com.itvdn.javaessencial.lecture1.hometask.task2;

public class Main {
    public static void main(String[] args) {

        Car car0 = new Car();
        Car car1 = new Car(2005);
        Car car2 = new Car(2005, Color.BLACK);

        System.out.println(car0 + "\n" + car1 + "\n" + car2);

    }
}
