package ua.com.itvdn.javaessencial.lecture1.hometask.task3;

public class Main {
    public static void main(String[] args) {

        Car car0 = new Car();
        Car car1 = new Car(2005);
        Car car2 = new Car(2006,220);
        Car car3 = new Car(2007,240,15000);
        Car car4 = new Car(2008,250,16000,Color.WHITE);

        System.out.println(car0 + "\n" + car1 + "\n" + car2 + "\n" + car3 + "\n" + car4);
    }
}
