package ua.com.itvdn.javaessencial.lecture6.lab;

////- Создать анонимный класс расширяющий интерфейс Printable, в методе print() которого будут печататься газеты.
////- Создать массив типа Printable, который будет содержать книги, журналы и обьект анонимного класса.
////- В цикле пройти по массиву и вызвать метод print() для каждого объекта.

public class Main {
    public static void main(String[] args) {

        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("prints newspaper");
            }
        };

        Printable[] printables = new Printable[]{
                new Book(), new Magazine(), printable};

        for (int i = 0; i < printables.length; i++) {
            printables[i].print();
        }

    }
}
