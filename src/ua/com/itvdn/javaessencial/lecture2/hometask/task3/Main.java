package ua.com.itvdn.javaessencial.lecture2.hometask.task3;
//Создать класс Vehicle.
//В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год
//выпуска).
//Создайте 3 производных класса Plane, Саг и Ship.
//Для класса Plane должна быть определена высота и количество пассажиров.
//Для класса Ship – количество пассажиров и порт приписки.
//Написать программу, которая выводит на экран информацию о каждом средстве передвижения.

import java.util.Scanner;

public class Main {
    public static final String YELLOW_TEXT = "\u001B[33m";
    public static final String RED_TEXT = "\u001B[31m";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.println(YELLOW_TEXT + "If you want to see information from plane enter: 1.\n" +
                    "from ship enter: 2.\n" + "from car enter: 3. " + "\nIf you want to way the program enter: 0.");
            int input = scan.nextInt();

            if (input == 0) {
                System.out.println("Bye - bye");
                break;
            }

            try {
                if (input == 1) {
                    Vehicle mriya = new Plane(4525.3256, 250000000, 850, 2019,
                            11000, 70);
                    System.out.println(mriya);
                    System.out.println("-----------------------------------------------------------------------");
                } else if (input == 2) {
                    Vehicle sagaydachniy = new Ship(54645.151, 16330000, 32,
                            1992, "Royal", 512);
                    System.out.println(sagaydachniy);
                    System.out.println("-----------------------------------------------------------------------");
                } else if (input == 3) {
                    Vehicle prius = new Car(212.526, 25000, 230, 2008);
                    System.out.println(prius);
                    System.out.println("-----------------------------------------------------------------------");
                } else {
                    throw new ArithmeticException();
                }
            } catch (ArithmeticException e) {
                System.out.println(RED_TEXT + "You enter incorrect symbol please enter 1,2,3 or 0 from exit");
            }
        }
        scan.close();
    }
}