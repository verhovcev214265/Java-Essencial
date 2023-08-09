package ua.com.itvdn.javaessencial.lecture7_exceptions.classwork.ex4_create_personal_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your login:");

        String login = scan.next();

        try {
            if (login.equals("putin")) throw new PersonalException("PTN PNH!");
            System.out.println("Hello " + login + ".");  // we can not to write 'else'.
        }catch (PersonalException e){
            System.out.println(e.getMessage());
        }
    }

}
