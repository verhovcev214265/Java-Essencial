package ua.com.itvdn.javaessencial.lecture4.hometasks.task0;

//Создать class Main, в нем создать список, добавить учителей, которых вы только сможете вспомнить со
//школы. И получить индекс самого лучшего учителя и самого не очень. Вывести список в консоль.

import java.util.ArrayList;

public class Teachers {
    public static void main(String[] args) {

        ArrayList<String> teachers = new ArrayList<>();
        teachers.add(0,"Lizukova Z.Interface");
        teachers.add(1,"Metelskaya L.M");
        teachers.add(2,"Batidersterchatov E.J");

        System.out.println("The beast teacher index is: " + teachers.indexOf("Lizukova Z.Interface"));
        System.out.println("The worse teacher index is: " + teachers.indexOf("Batidersterchatov E.J"));
        System.out.println("The list all teachers : " + teachers);
    }
}
