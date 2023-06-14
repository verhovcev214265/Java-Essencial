package ua.com.itvdn.javaessencial.lecture3.classwork.abstractclasses.ex1_Animal;

import ua.com.itvdn.javaessencial.lecture3.classwork.abstractclasses.ex1_Animal.Animal;

public class Spider extends Animal {

    @Override
    public void move() {
        System.out.println("Interface can walk on eight paws");
    }
}
