package ua.com.itvdn.javaessencial.students.maks.lecture0.pr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[2];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(); //!

            System.out.println("Enter the model of the " + (i + 1) + " car:");
            cars[i].setModel(scan.next());

            System.out.println("Enter the color of  the " + (i + 1) + " car:");
            cars[i].setColor(scan.next());

            System.out.println("Enter the serial number of the " + (i + 1) + " car:");
            cars[i].setSerialNumber(scan.nextInt());

            System.out.println("Enter the type of engine of the " + (i + 1) + " car:");
            cars[i].setEngine(scan.next());

            System.out.println("Enter the maximal speed of the " + (i + 1) + " car:");
            cars[i].setMaxSpeed(scan.nextInt());

            System.out.println("Enter the owner of the " + (i + 1) + " car:"); //!
            cars[i].setOwner(scan.next()); //!
        }

        for(Car car : cars) System.out.print(car);
        cars.toString(); //!

        System.out.println("Which car do you want to change (enter the serial number)?");
        int inputSerialNumber = scan.nextInt(); //!

        boolean exit = false;
        while (!exit){
            System.out.println("What do you want to do: " + "\n" +
                    "change color - press 1     change owner - press 2" +
                    "     change max speed - press 3     exit - press 4");
            int chose1 = scan.nextInt();

            switch (chose1) {
                case (1):
                    System.out.println("Which color do you want to change on?");
                    String newColor = scan.next();
                    cars[inputSerialNumber].changeColor(newColor);
                    break;
                case (2):
                    System.out.println("Which owner do you want to change on?");
                    String newOwner = scan.next();
                    cars[inputSerialNumber].changeOwner(newOwner);
                    break;
                case (3):
                    System.out.println("Which maximal speed do you want to change on?");
                    int newMaxSpeed = scan.nextInt();
                    cars[inputSerialNumber].changeMaxSpeed(newMaxSpeed);
                    break;
                default:
                    System.out.println("Bye - bye.");
                    exit = true;
            }
        }



        for(Car car : cars) System.out.println(car);

//        for (int i = 0; i < cars.length; i++) {
//            System.out.println("Car number " + (i + 1) +
//                    "\n" + "Car model: " + cars[i].getModel() +
//                    "\n" + "Car color: " + cars[i].getColor() +
//                    "\n" + "Car serial number: " + cars[i].getSerialNumber() +
//                    "\n" + "Car type of engine: " + cars[i].getEngine() +
//                    "\n" + "Car customization: " + cars[i].getOwner() +
//                    "\n" + "Car max speed: " + cars[i].getMaxSpeed() + "\n");
//        }

        scan.close();
    }
}
