package ua.com.itvdn.javaessencial.lecture5.lab.task1;

//В методе main():
//- создать экземпляр класса User и вызвать метод createQuery();
//- создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию user.new Query();
//- создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию new User().new Query();
//

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter login: ");
        String log = scan.nextLine();
        System.out.println("Enter password: ");
        int pass = scan.nextInt();

        User user = new User(log,pass);
        user.createQuery();

        user.new Query().printToLog();

        User.Query userQuery = new User(log,pass).new Query();
        userQuery.printToLog();

        System.out.println(user);
    }
}
