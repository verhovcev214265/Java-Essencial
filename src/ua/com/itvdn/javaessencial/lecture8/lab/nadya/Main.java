package ua.com.itvdn.javaessencial.lecture8.lab.nadya;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Start program input 1.\n" +
                "Exit input 0 ");

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        if (input == 0){
            System.out.println("Bye - bye");
        }else {
            Car car = new Car();
            car.carsManipulation();
        }
        scan.close();
    }
}
