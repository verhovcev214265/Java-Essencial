package ua.com.itvdn.javaessencial.lecture7_exceptions.lab.tak1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();

        System.out.println("Do you have collar for you dog?\n" +
                "If yes press 1 and 2 if you don`t");

        Scanner scan = new Scanner(System.in);
        int inputCollar = scan.nextInt();
        dog.isCollar(inputCollar);
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("Do you have leash for you dog?\n" +
                "If yes press 1 and 2 if you don`t");

        int inputLeash = scan.nextInt();
        dog.isLeash(inputLeash);
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("Do you have covidCertificate for you dog? =)\n" +
                "If yes press 1 and 2 if you don`t");

        int inputCertificate = scan.nextInt();
        dog.isCovidCertificate(inputCertificate);
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println(dog);
        dog.walk();
    }
}

