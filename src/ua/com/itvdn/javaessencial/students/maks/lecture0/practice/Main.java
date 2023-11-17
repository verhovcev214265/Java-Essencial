package ua.com.itvdn.javaessencial.students.maks.lecture0.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Enter the model, color, serial number," +
                    " type of engine and max speed of " + (i + 1) + " car:");
            cars[i] = new Car(scan.next(), scan.next(), scan.nextInt(), scan.next(), scan.nextInt());
        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println("if you want to change something in car number " + (i + 1) +
                    ", press 1. Otherwise, press 2.");
            int firsChoice = scan.nextInt();

            if (firsChoice == 1) {
                System.out.println("What do you want to add or change:" + "\n" + "Color - press 1" +
                        "\n" + "Customization - press 2" + "\n" + "Max speed - press 3");
                int secondChoice = scan.nextInt();

                if (secondChoice == 1) {
                    System.out.println("What color do you want to change to?");
                    String newColor = scan.next();

                    cars[i].changeColor(newColor);
                } else if (secondChoice == 2) {
                    cars[i].customization("SUPERTURBO+");

                    System.out.println("Customization has been added." + "\n");
                } else if (secondChoice == 3) {
                    System.out.println("Enter the max speed (use only numbers):");
                    int newMaxSpeed = scan.nextInt();

                    cars[i].changeMaxSpeed(newMaxSpeed);
                } else {
                    System.out.println("You have entered something wrong. We haven`t made any changes.");
                }
            } else if (firsChoice == 2) {

            }else {
                System.out.println("You have entered something wrong. We haven`t made any changes.");
            }
        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car number " + (i + 1) +
                    "\n" + "Car model: " + cars[i].getModel() +
                    "\n" + "Car color: " + cars[i].getColor() +
                    "\n" + "Car serial number: " + cars[i].getSerialNumber() +
                    "\n" + "Car type of engine: " + cars[i].getEngine() +
                    "\n" + "Car customization: " + cars[i].getCustom() +
                    "\n" + "Car max speed: " + cars[i].getMaxSpeed() + "\n");
        }
    }
}
