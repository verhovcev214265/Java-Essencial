package ua.com.itvdn.javaessencial.lecture4.classwork.array_list.ex2_Methods_p2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("name");
        list.add("surname");

        // задаємо розмір списку
        list.ensureCapacity(20);

        // Повертає лише заповнену кількість елементів
        System.out.println(list.size());

        // Дістаємо елемент за індексом
        System.out.println(list.get(0));

        // IndexOutOfBoundsException
        // System.out.println(list.get(2));

        // Дістаємо індекс за значенням об'єкта якщо даного об'єкту не існує в списку повернеться (-1)
        System.out.println(list.indexOf("surname"));

        // Дістаємо індекс з кінця списку
        list.add("name");
        System.out.println(list.indexOf("name") + "\n" + list.lastIndexOf("name"));

    }
}
