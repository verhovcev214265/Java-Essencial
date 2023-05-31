package ua.com.itvdn.javaessencial.lecture1.lab.task2;

//Задание 2
//Реализуйте класс Дробь. Необходимо хранить числитель и знаменатель в качестве полей.
//Реализуйте методы для ввода данных в поля, а также конструктор с параметрами. Выполните арифметические операции
//(сложение, вычитание, умножение, деление, и т.д.) дроби с дробью.

public class Fraction {
    private int numerator;   // чисельник
    private int denominator; // знаменник

    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            System.out.println("Помилка: знаменник не може бути рівним нулю.");
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction add(Fraction other) {
        int resultNumerator = numerator * other.denominator + other.numerator * denominator;
        int resultDenominator = denominator * other.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction subtract(Fraction other) {
        int resultNumerator = numerator * other.denominator - other.numerator * denominator;
        int resultDenominator = denominator * other.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction multiply(Fraction other) {
        int resultNumerator = numerator * other.numerator;
        int resultDenominator = denominator * other.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction divide(Fraction other) {
        if (other.numerator != 0) {
            int resultNumerator = numerator * other.denominator;
            int resultDenominator = denominator * other.numerator;
            return new Fraction(resultNumerator, resultDenominator);
        } else {
            System.out.println("Помилка: ділення на нуль неможливе.");
            return null;
        }
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}

