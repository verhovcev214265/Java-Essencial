package ua.com.itvdn.javaessencial.lecture7.hometasks.task1;

//Написать программу, выполняющую следующие действия:
// ввод с клавиатуры данных в массив, состоящий из пяти элементов типа Worker (записи должны
//быть упорядочены по алфавиту);
// если значение года введено не в соответствующем формате выдает исключение.
// вывод на экран фамилии работника, стаж работы которого превышает введенное значение.

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Worker implements Comparable {

    private String surname;
    private String name;
    private String position;
    private int workExperience;

    public Worker(String surname, String name, String position, int workExperience) {
        this.surname = surname;
        this.name = name;
        this.position = position;
        this.workExperience = workExperience;
    }

    @Override
    public int compareTo(Object o) {
        return this.surname.compareTo(((Worker)o).surname);
    }

    public static void creatWorkers(){
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
                        }
                    } catch (ArithmeticException e) {
                        System.out.println("The value of experience must be more 0!!!");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("You enter incorrect symbol!!!");
            }
        }
        Arrays.sort(workers);
        for (Worker temp : workers){
            System.out.println(temp + "\n");
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
                        System.out.println("Worker: " + workers[i].getSurname() + " has " + workers[i].getWorkExperience() );
                    }
                }
            }
        }catch (InputMismatchException e) {
            System.out.println("You enter incorrect symbol!!!");
        }
        sc.close();
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "surname = '" + surname + '\'' +
                ", name = '" + name + '\'' +
                ", position = '" + position + '\'' +
                ", workExperience = " + workExperience +
                '}';
    }
}