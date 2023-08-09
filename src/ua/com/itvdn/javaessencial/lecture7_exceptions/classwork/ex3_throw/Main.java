package ua.com.itvdn.javaessencial.lecture7_exceptions.classwork.ex3_throw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your login:");

        String login = scan.next();

        Exception myException = new Exception("PTN PNH!");
        try {
            if (login.equals("putin")) throw myException;
            else System.out.println("Hello " + login + ".");
        } catch (Exception e) {
            System.out.println("Processing..." + "\n" + e.getMessage());
        }

//        try {
//            if (login.equals("putin")) throw new Exception("PTN PNH!");
//            else System.out.println("Hello " + login + ".");
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        scan.close();
    }
}
