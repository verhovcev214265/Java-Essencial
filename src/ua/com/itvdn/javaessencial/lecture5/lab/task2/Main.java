package ua.com.itvdn.javaessencial.lecture5.lab.task2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter login: ");
        String log = scan.nextLine();
        System.out.println("Enter password: ");
        int pass = scan.nextInt();

        User user = new User(log,pass);
        user.createAndShow();

        System.out.println(user);

    }
}
