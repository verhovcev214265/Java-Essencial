package ua.com.itvdn.javaessencial.lecture1.hometask.task4;

public class Main {
    public static void main(String[] args) {

        Car bmw = new Car();
        System.out.println("Empty constructor: " + bmw);
        System.out.println("---------------------------------------------------------------------------------------");

        Car opel = new Car(2005);
        System.out.println("Year production: " + opel.getYearProduction());
        System.out.println("---------------------------------------------------------------------------------------");

        Car honda = new Car(2006,230);
        System.out.println("Year production: " + honda.getYearProduction() + "\nSpeed: " + honda.getSpeed());
        System.out.println("---------------------------------------------------------------------------------------");

        Car mercedes = new Car(2007,240, 16000);
        System.out.println("Year production: " + mercedes.getYearProduction() + "\nSpeed: " + mercedes.getSpeed() +
                "\nWeight: " + mercedes.getWeight());
        System.out.println("---------------------------------------------------------------------------------------");

        Car bentley = new Car(2008,250, 17000, Color.WHITE);
        System.out.println("Year production: " + bentley.getYearProduction() + "\nSpeed: " + bentley.getSpeed() +
                "\nWeight: " + bentley.getWeight() + "\nColor: " + Color.WHITE);
        System.out.println("---------------------------------------------------------------------------------------");

    }
}
