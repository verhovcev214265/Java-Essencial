package ua.com.itvdn.javaessencial.lecture1.lab.task2;

public class Main {
    public static void main(String[] args) {

        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(4, 5);

        Fraction sum = fraction1.add(fraction2);
        System.out.println("Сума: " + sum);

        Fraction difference = fraction1.subtract(fraction2);
        System.out.println("Різниця: " + difference);

        Fraction product = fraction1.multiply(fraction2);
        System.out.println("Добуток: " + product);

        Fraction quotient = fraction1.divide(fraction2);
        System.out.println("Частка: " + quotient);
    }
}

