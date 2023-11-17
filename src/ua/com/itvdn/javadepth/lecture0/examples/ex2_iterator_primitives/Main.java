package ua.com.itvdn.javadepth.lecture0.examples.ex2_iterator_primitives;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(8);
        System.out.println(arrayList);

        // За допомоги інтерфейсу Iterator можемо пересуватись по нашому списку
        Iterator<Integer> iterator = arrayList.iterator();
        // Дізнаємось чи має об'єкт iterator наступний елемент.
        int item = 0;
        while (iterator.hasNext()) {
            // Переходимо до наступного елементу списку і виводимо його.
            Integer temp = iterator.next();
            temp++;
            item++;
            if (item < arrayList.size()) System.out.print(temp + ", ");
            else System.out.print(temp + ".");
        }
        // Зміни в iterator не впливають на об'єкт arrayList
        System.out.println("\n" + arrayList + "\n" +
                "-------------------------------------------------------------------------------------"
        );

        ListIterator<Integer> listIterator = arrayList.listIterator();
        item = 0;
        while (listIterator.hasNext()) {
            Integer temp = listIterator.next();
            item++;
            if (item < arrayList.size()) System.out.print(temp + ", ");
            else System.out.print(temp + ".\n");
        }

        item = 0;
        while (listIterator.hasPrevious()) {
            Integer temp = listIterator.previous();
            item++;
            if (item < arrayList.size()) System.out.print(temp + ", ");
            else System.out.print(temp + ".\n" +
                    "-------------------------------------------------------------------------------------"
            );
        }

    }
}
