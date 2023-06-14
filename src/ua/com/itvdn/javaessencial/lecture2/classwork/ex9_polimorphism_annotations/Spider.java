package ua.com.itvdn.javaessencial.lecture2.classwork.ex9_polimorphism_annotations;

public class Spider extends Animal{

    @Override
    public void move(){
        System.out.println("Interface can walk for eight paws =) ");
    }
}
