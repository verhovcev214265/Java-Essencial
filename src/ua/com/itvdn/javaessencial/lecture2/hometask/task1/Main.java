package ua.com.itvdn.javaessencial.lecture2.hometask.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter yor text to print on Canon: ");
        String input = scan.nextLine();

        Canon canon = new Canon("Canon");
        canon.print(input);
        System.out.println(canon);

        Printer canonUp = canon;
        canonUp.print(input);
        System.out.println(canonUp);

        Canon canonDown = (Canon) canonUp;
        canonDown.print(input);
        System.out.println(canonDown);

        System.out.println("--------------------------------------------------------------------------------------");

        Samsung samsung = new Samsung("Samsung");
        samsung.print(input);
        System.out.println(samsung);

        Printer samsungUp = samsung;
        samsungUp.print(input);
        System.out.println(samsungUp);

        Samsung samsungDown = (Samsung) samsungUp;
        samsungDown.print(input);
        System.out.println(samsungDown);

    }
}