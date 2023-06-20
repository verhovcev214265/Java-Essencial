package ua.com.itvdn.javaessencial.lecture4.classwork.iterator_with_arraylist;

import ua.com.itvdn.javaessencial.ITaskConstants;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);

        /*
         Присвоюємо посилання на об'єкт класу ArrayList через (з типом) інтерфейс Iterator,
         за допомоги якого можемо проходити по нашому списку.
         */

        Iterator<Integer> iterator = numbers.iterator();

        // Дізнаємось чи є наступний елемент у списку
        while (iterator.hasNext()){
            // В значення "класу обгортки" Integer присвоюємо посилання на Iterator і отримуємо його за доп. методу next()
            Integer number = iterator.next();
            System.out.print(number + " ");
        }
        System.out.println(ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Оптимізований (має більше можливостей) ListIterator
        ListIterator<Integer> listIterator = numbers.listIterator();

        while (listIterator.hasNext()){
            Integer number = listIterator.next();
            System.out.print(number + " ");
        }
        System.out.println(ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Проходимо по списку в зворотньому напрямку.
        while (listIterator.hasPrevious()){
            Integer previousNumber = listIterator.previous();
            System.out.print(previousNumber + " ");
        }
    }
}
