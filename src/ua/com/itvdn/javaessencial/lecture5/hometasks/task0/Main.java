package ua.com.itvdn.javaessencial.lecture5.hometasks.task0;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(2,2));

        System.out.println(calculator.subtract(2,2));

        System.out.println(calculator.multiply(2,2));

        calculator.devide(2,2);
        calculator.devide(5,0);

    }
}
