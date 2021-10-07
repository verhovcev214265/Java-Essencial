package ua.com.itvdn.javaessencial.lecture2.lab.task1;

public class Hamster extends Animal{
    public Hamster(String name, String type) {
        super(name, type);
    }

    @Override
    void sound() {
        System.out.println("Hrum - hrum");
    }
}
