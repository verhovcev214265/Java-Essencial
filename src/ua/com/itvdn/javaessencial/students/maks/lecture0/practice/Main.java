package ua.com.itvdn.javaessencial.students.maks.lecture0.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[2];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();

            System.out.println("Enter model:");
            String model = scan.next();
            cars[i].setModel(model);

            System.out.println("Enter color:");
            String color = scan.next();
            cars[i].setColor(color);

            System.out.println("Enter serialNumber:");
            int serialNumber = scan.nextInt();
            cars[i].setSerialNumber(serialNumber);

            System.out.println("Enter engine:");
            String engine = scan.next();
            cars[i].setEngine(engine);

            System.out.println("Enter custom:");
            String custom = scan.next();
            cars[i].setCustom(custom);

            System.out.println("Enter max speed:");
            int maxSpeed = scan.nextInt();
            cars[i].setMaxSpeed(maxSpeed);
        }

        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("Enter serial number of car for action: \n" +
                "exit any button:");
        int inputSerialNumber = scan.nextInt();


        if (inputSerialNumber < 0 || inputSerialNumber > cars.length) {
            System.out.println("bye - bye");
        } else {
            System.out.println(
                    "Menu: \n" +
                            "change color press 1.\n" +
                            "change customization press 2.\n" +
                            "change max speed press 3." +
                            "exit press another one button."
            );

            int action = scan.nextInt();

            switch (action) {
                case 1:
                    System.out.println("Enter color:");
                    String newColor = scan.next();
                    cars[inputSerialNumber].setColor(newColor);
                    break;
                case 2:
                    System.out.println("Enter customization:");
                    String newCustom = scan.next();
                    cars[inputSerialNumber].setCustom(newCustom);
                    break;
                case 3:
                    System.out.println("Enter max speed:");
                    int newMaxSpeed = scan.nextInt();
                    cars[inputSerialNumber].setMaxSpeed(newMaxSpeed);
                    break;
                default:
                    System.out.println("bye - bye");
            }
        }

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
