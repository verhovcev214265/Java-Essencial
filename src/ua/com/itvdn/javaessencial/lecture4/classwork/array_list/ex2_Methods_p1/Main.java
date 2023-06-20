package ua.com.itvdn.javaessencial.lecture4.classwork.array_list.ex2_Methods_p1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Оголошуємо список типу ArrayList.
        ArrayList<String> words = new ArrayList<>();

        // додаємо елементи в список.
        words.add("Hello");
        words.add("student");
        words.add("how are you?");

        System.out.println(words);

        // додаємо елемент в список за індексом.
        words.add(0, "The lecturer said - ");
        System.out.println(words);

        // Видаляємо елемент за індексом.
        words.remove(1);
        System.out.println(words);

        // Видаляємо елемент за об'єктом (значенням).
        words.remove("student");
        System.out.println(words);
    }
}
