package ua.com.itvdn.javaessencial.students.maks.lecture0.task2;

/*
Используя IDEA, создайте проект с пакетом. Создать класс Computer, создать массив объектов
Computers размером 5. Далее руками создать 5 экземпляров этого класса и записать в компьютер
(используя loop)
 */

public class Computer {
    protected String[] computers = new String[5];

    protected void setComputers(String firstWord, String secondWord, String thirdWord, String fourthWord, String fifthWord) {
        for (int i = 0; i < computers.length; i++) {
            if (i == 0) computers[i] = firstWord;
            else if (i == 1) computers[i] = secondWord;
            else if (i == 2) computers[i] = thirdWord;
            else if (i == 3) computers[i] = fourthWord;
            else if (i == 4) computers[i] = fifthWord;
        }
    }
    protected void show() {
        for (int i = 0; i < computers.length; i++) {
            System.out.print(computers[i] + " ");
        }
    }

}
