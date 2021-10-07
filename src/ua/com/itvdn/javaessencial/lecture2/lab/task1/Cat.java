package ua.com.itvdn.javaessencial.lecture2.lab.task1;

public class Cat extends Animal{
    public Cat(String name, String type) {
        super(name, type);
    }

    @Override
    void sound() {
        System.out.println("May - may");
    }
}
