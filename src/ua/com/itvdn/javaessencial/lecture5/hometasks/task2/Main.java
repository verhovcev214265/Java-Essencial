package ua.com.itvdn.javaessencial.lecture5.hometasks.task2;
import java.util.Scanner;

public class Main {
    public static final String YELLOW_TEXT = "\u001B[33m";
    public static final String PURPLE_TEXT = "\u001B[35m";
    public static final String RED_TEXT = "\u001B[31m";

    public static void main(String[] args) {

        System.out.println(YELLOW_TEXT + "If you want to convert meters to kilometers, press 1. \n" +
                "If kilometers in miles, press 2. \n" +
                "If meters in feet press 3. \n" +
                "If you want to go out press 0.");

        Scanner scan = new Scanner(System.in);
        int menu = scan.nextInt();

        try {
            if (menu == 0) {
                System.out.println(PURPLE_TEXT + "Bye - bye");
                return;
            } else if (menu < 0) {
                throw new ArithmeticException();
            }else{
                switch (menu){
                    case 1 -> {
                        System.out.println("Enter value to convert meters to kilometers: ");
                        double valueMeters = scan.nextDouble();
                        Distance.Converter.metersToKilometers(valueMeters);
                        Distance.print(Distance.getDistance());
                    }
                    case 2 -> {
                        System.out.println("Enter value to convert kilometers to miles: ");
                        double valueKilometers = scan.nextDouble();
                        Distance.Converter.kilometersToMiles(valueKilometers);
                        Distance.print(Distance.getDistance());
                    }
                    case 3 -> {
                        System.out.println("Enter value to convert meters to feet: ");
                        double valueMetersFeet = scan.nextDouble();
                        Distance.Converter.metersAndFeet(valueMetersFeet);
                        Distance.print(Distance.getDistance());
                    }
                }
            }
        } catch (ArithmeticException e) {
            System.out.println(RED_TEXT + "You enter incorrect symbol");
        }

        scan.close();
    }
}