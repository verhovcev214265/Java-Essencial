package ua.com.itvdn.javaessencial.lecture7_exceptions.lab.task0;

import java.util.Scanner;

//    Пользователь вводит значения, над которыми хочет произвести операцию и выбрать саму операцию. При
//    возникновении ошибок должны выбрасываться исключения.
public class Main {
    public static final String YELLOW_TEXT = "\u001B[33m";
    public static final String BLUE_TEXT = "\u001B[34m";
    public static final String RED_TEXT = "\u001B[31m";

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        for (int i = 0; i < 4; i++) {

        System.out.println(BLUE_TEXT + "Enter first operand: ");
        Scanner scan = new Scanner(System.in);
        double input1 = scan.nextDouble();

        System.out.println(BLUE_TEXT + "Enter second operand: ");
        double input2 = scan.nextDouble();

        System.out.println(YELLOW_TEXT + "Choose operation: \n" +
                "if you want add enter: 1\n" +
                "if you want subtract enter: 2\n" +
                "if you want multiply enter: 3\n" +
                "if you want divide enter: 4");
        int operation = scan.nextInt();

            switch (operation) {
                case 1 -> {
                    System.out.println("answer = " + calculator.add(input1, input2));
                }
                case 2 -> {
                    System.out.println("answer = " + calculator.subtract(input1, input2));
                }
                case 3 -> {
                    System.out.println("answer = " + calculator.multiply(input1, input2));
                }
                case 4 -> {
                    System.out.println("answer = ");
                    calculator.divide(input1, input2);
                }
                default -> {
                    System.out.println(RED_TEXT + "You enter incorrect symbol, please enter 1,2,3 or 4 ONLY!");
                }
            }
        }
    }
}
