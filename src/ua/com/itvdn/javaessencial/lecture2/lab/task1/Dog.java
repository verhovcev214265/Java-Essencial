package ua.com.itvdn.javaessencial.lecture2.lab.task1;

public class Dog extends Animal{

    public Dog(String name, String type) {
        super(name, type);
    }

    @Override
    void sound() {
        System.out.println("Gaw - gaw");
    }


}
