package ua.com.itvdn.javaessencial.lecture7_exceptions.lab.task0;
//    В теле класса создайте четыре метода для арифметических действий: (add – сложение, sub – вычитание,
//    mul – умножение, div – деление).
//    Метод деления должен делать проверку деления на ноль, если проверка не проходит, сгенерировать
//    исключение.

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

    void divide(double operand1, double operand2) {
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
