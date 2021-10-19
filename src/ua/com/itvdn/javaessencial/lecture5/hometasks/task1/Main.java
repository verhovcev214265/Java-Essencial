package ua.com.itvdn.javaessencial.lecture5.hometasks.task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter message from wheel: ");
        Scanner scan = new Scanner(System.in);
        String messageW = scan.nextLine();

        Vehicle.Wheel wheel = new Vehicle().new Wheel();
        wheel.print(messageW);

        System.out.println("---------------------------------------------------------------------------------------");

        System.out.println("Enter message from wheel: ");
        String messageD = scan.nextLine();

        Vehicle.Door door = new Vehicle().new Door();
        door.print(messageD);

    }
}
