package ua.com.itvdn.javaessencial.students.vlada.lecture0.task2;

/*
Створюємо цілочислову змінну з іменем "i" зі значенням "6"
Створюємо цілочислову змінну з іменем "j" зі значенням "7"
Створюємо цілочислову змінну з іменем "answer" в який записуємо результат множення (i та j)

Виводимо відповідь на екран
Має вийти: answer = 42

Після цього
створити змінну double d зі значенням: “2.5”
Вивести на екран суму змінних: (i + j  * d)

Виводимо відповідь на екран
Має вийти: 23.5
 */

public class Homework3 {
    public static void main(String[] args) {
        int i = 6;
        int j = 7;
        int answer;

        answer = i * j;
        System.out.println(i + " * " + j + " = " + answer);

        double d = 2.5;
        System.out.println(i + j * d);
    }
}
