package ua.com.itvdn.javaessencial.lecture7_exceptions.classwork.ex5_finaly;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your login:");

        String login = scan.next();

        try {
            if (login.equals("putin")) throw new Exception("PTN PNH!");
            else System.out.println("Hello " + login + ".");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("In any case PTN PNH =) ");
        }
    }

}
