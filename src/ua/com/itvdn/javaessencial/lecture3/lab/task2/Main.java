package ua.com.itvdn.javaessencial.lecture3.lab.task2;

//- Создать массив типа Printable, который будет содержать книги и журналы.
//- В цикле пройти по массиву и вызвать метод print() для каждого объекта.

public class Main {
    public static void main(String[] args) {

        Printable[] printables = new Printable[2];
        printables[0] = new Book();
        printables[1] = new Magazine();

        for (int i = 0; i < printables.length; i++) {
                printables[i].print();
        }

    }
}
