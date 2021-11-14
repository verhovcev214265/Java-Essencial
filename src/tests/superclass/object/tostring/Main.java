package tests.superclass.object.tostring;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car(2021, "X7", 2808);
        Car bmw2 = new Car(2021, "X7", 280);
        System.out.println(bmw);
        System.out.println(Car.getIsReagyToDrive());
        System.out.println("=====================================================================================");
        System.out.println(bmw2);
        System.out.println(Car.getIsReagyToDrive());
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println(bmw.equals(bmw2));
    }
}
