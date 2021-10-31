package ua.com.itvdn.javaessencial.lecture7.hometasks.task1;

///Написать программу, выполняющую следующие действия:
//// ввод с клавиатуры данных в массив, состоящий из пяти элементов типа Worker (записи должны
////быть упорядочены по алфавиту);
//// если значение года введено не в соответствующем формате выдает исключение.
//// вывод на экран фамилии работника, стаж работы которого превышает введенное значение.

import java.util.InputMismatchException;
import java.util.Scanner;

public class HRDepartment {
    public static void main(String[] args) {

        Worker[] workers = new Worker[5];

        for (int i = 0; i < workers.length; i++) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter worker surname: ");
            String surName = scan.nextLine();

            System.out.println("Enter worker name: ");
            String name = scan.nextLine();

            System.out.println("Enter worker position: ");
            String position = scan.nextLine();

            try {
                System.out.println("Enter worker experience: ");

                if (!scan.hasNextInt()) {
                    throw new InputMismatchException();
                } else {
                    int workExperience = scan.nextInt();
                    try {
                        if (workExperience < 0) {
                            throw new ArithmeticException();
                        } else {
                            workers[i] = new Worker(surName, name, position, workExperience);
                            System.out.println(workers[i]);
                        }
                    } catch (ArithmeticException e) {
                        System.out.println("The value of experience must be more 0!!!");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("You enter incorrect symbol!!!");
            }
        }
        System.out.println("----------------------------------------------------------------------------------");

       System.out.println("Enter the desired work experience: ");
       Scanner sc = new Scanner(System.in);

       try {
           if (!sc.hasNextInt()){
               throw new InputMismatchException();
           }else {
               int desiredExperience = sc.nextInt();

               for (int i = 0; i < workers.length; i++) {
                   if (workers[i].getWorkExperience() > desiredExperience){
                       System.out.println("Worker: " + workers[i].getSurname() + "has " + workers[i].getWorkExperience() );
                   }
               }
           }
       }catch (InputMismatchException e) {
           System.out.println("You enter incorrect symbol!!!");
       }

       sc.close();

    }
}
