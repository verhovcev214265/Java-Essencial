package ua.com.itvdn.javaessencial.lecture4.hometasks.task3;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

//Создать класс Main, создать список целых чисел и используя ListIterator пройтись по списку и увеличить
//значения на 1;

public class Main {

    public static final String BLUE_TEXT = "\u001B[34m";
    public static final String YELLOW_TEXT = "\u001B[33m";
    public static final String RED_TEXT = "\u001B[31m";

    public static void main(String[] args) {

        System.out.println("Enter the number of numeric items you want to enter: ");
        Scanner scan = new Scanner(System.in);
        int quantity = scan.nextInt();

        try {
            if (quantity > 0) {

                ArrayList<Integer> numbers = new ArrayList<>();

                for (int i = 0; i < quantity; i++) {

                    System.out.println("Enter number: ");
                    int number = scan.nextInt();
                    numbers.add(number);
                }

                System.out.println(numbers);
                System.out.println("---------------------------------------------------------------------------------------");

                ListIterator<Integer> listIterator = numbers.listIterator();

                while (listIterator.hasNext()) {
                    Integer numsListIter = listIterator.next();
                    System.out.print(YELLOW_TEXT + ++numsListIter + " ");
                }

                System.out.println("\n---------------------------------------------------------------------------------------");

                while (listIterator.hasPrevious()) {
                    Integer previousNums = listIterator.previous();
                    System.out.print(BLUE_TEXT + previousNums + " ");
                }
            }else {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println(RED_TEXT + "You enter incorrect symbol");
        }

        scan.close();
    }
}