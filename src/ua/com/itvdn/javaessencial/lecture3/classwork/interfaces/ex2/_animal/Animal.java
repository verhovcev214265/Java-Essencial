package ua.com.itvdn.javaessencial.lecture3.classwork.interfaces.ex2._animal;

public abstract class Animal implements ICreator {

    // Якщо клас є абстрактним ін не зобов'язаний перевизначати методи інтерфейсу, але це можливо за бажанням.
    @Override
    public void live() {
        System.out.println("Interface live.");
    }

    public abstract void move();

    public void eat() {
        System.out.println("Interface can eat.");
    }
}
