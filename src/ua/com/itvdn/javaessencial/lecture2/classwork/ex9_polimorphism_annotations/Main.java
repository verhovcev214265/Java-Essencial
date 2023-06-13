package ua.com.itvdn.javaessencial.lecture2.classwork.ex9_polimorphism_annotations;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();

        Cat cat = new Cat();

        Spider spider = new Spider();

        animal.move();
        cat.move();
        spider.move();
    }
}
