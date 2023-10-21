package ua.com.itvdn.javaessencial.students.matvyi.lecture1.task4;

/*
Создать переменную типа boolean evenNumber
Использовать if - else, при котором evenNumber будет выдавать true, если число четное и false, если нечетное
Вывести на экран результат применения evenNumber  для переменных i и j ( i = 6, j = 7)

Должно получиться:
evenNumber = true
evenNumber = false
 */

public class hom3 {
    public static void main(String[] args) {

        boolean evenNumber;
        int i = 6;
        int j = 7;

        if (i % 2 == 0) evenNumber = true;
        else evenNumber = false;

        System.out.println("i = " + evenNumber);

        if (j % 2 == 0) evenNumber = true;
        else evenNumber = false;

        System.out.println("j = " + evenNumber);

    }
}
