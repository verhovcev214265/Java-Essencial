package ua.com.itvdn.javaessencial.lecture4.hometasks.task1andtask2;
//Задание 2
//Создать класс Zoo. В классе создать список, в который записать 8 животных через метод add(index,
//element).
//Вывести список в консоль.

//Задание 3
//Используя класс Zoo Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль.

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();
        animals.add(0,"Cat");
        animals.add(1,"Dog");
        animals.add(2,"Rebid");
        animals.add(3,"Duck");
        animals.add(4,"Lion");
        animals.add(5,"Tiger");
        animals.add(6,"Puma");
        animals.add(7,"Mouse");

        System.out.println("List length = " + animals.size());
        System.out.println(animals);
        System.out.println("--------------------------------------------------------------------------------------");

        animals.remove("Rebid");
        animals.remove("Lion");
        animals.remove("Puma");
        System.out.println("List length after method 'remove' = " + animals.size());
        System.out.println(animals);





    }
}
