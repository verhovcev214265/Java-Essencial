package ua.com.itvdn.javaessencial.students.vlada.lecture0.task0;

/*
Домашнее задание:
Создать строковую переменную message, записать в нее значение: “Java forever”
Создать строковую переменную words, записать в нее значение: “Java forever”
Вывести на экран последовательно message и words
Должно получиться:
Hello world!
Java forever
Создать строковую константу SPACE, записать в нее значение: “  “ (пробел)
Вывести на экран: message + space + words
Должно получится:
Hello world! Java forever
 */

public class Homework1 {

    private static final String SPACE = " ";

    public static void main(String[] args) {
        String massage = "Hello world!";
        String words = "Java forever";

        System.out.println(massage + "\n" + words + "\n" + massage + SPACE + words);

    }
}
