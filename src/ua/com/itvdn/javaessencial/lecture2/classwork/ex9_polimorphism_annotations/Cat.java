package ua.com.itvdn.javaessencial.lecture2.classwork.ex9_polimorphism_annotations;

public class Cat extends Animal{

    @Override
    public void move(){
        System.out.println("I can walk for four paws =) ");
    }
}
