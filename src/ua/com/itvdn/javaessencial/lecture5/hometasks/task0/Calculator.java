package ua.com.itvdn.javaessencial.lecture5.hometasks.task0;
//Создать класс Calculator, с методами для выполнения основных арифметических операций.
//Написать программу, которая выводит на экран основные арифметические операции.
//add, subtract, multiply, divide

// Якщо чесно не зрозумів навіщо тут це завдання може це не вся умова?

public class Calculator {

    public static final String RED_TEXT = "\u001B[31m";

    double add(double operand1, double operand2) {
        return operand1 + operand2;
    }

    double subtract(double operand1, double operand2) {
        return operand1 - operand2;
    }

    double multiply(double operand1, double operand2) {
        return operand1 * operand2;
    }

    void devide(double operand1, double operand2) {
        try {
            if (operand2 != 0) {
                double result = operand1 / operand2;
                System.out.println(result);
            } else {
                throw new ArithmeticException();
            }
        }catch (ArithmeticException e){
            System.out.println(RED_TEXT + "Cannot be divided by 0 !!!");
        }

    }
}
