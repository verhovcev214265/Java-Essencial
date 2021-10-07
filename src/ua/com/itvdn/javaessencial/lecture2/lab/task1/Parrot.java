package ua.com.itvdn.javaessencial.lecture2.lab.task1;

public class Parrot extends Animal{
    public Parrot(String name, String type) {
        super(name, type);
    }

    @Override
    void sound() {
        System.out.println("Kesha Duraaaaaaaaaaaaaaaak =) ");
    }
}
