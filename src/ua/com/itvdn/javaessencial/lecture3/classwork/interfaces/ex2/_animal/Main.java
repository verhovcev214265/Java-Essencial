package ua.com.itvdn.javaessencial.lecture3.classwork.interfaces.ex2._animal;

import ua.com.itvdn.javaessencial.ITaskConstants;

public class Main {
    public static void main(String[] args) {

        Dog rex = new Dog();

        String rexSpeak = rex.speak();  // ICreator (default method)
        rex.move(); // abstract method from Animal (was override in Dog)
        rex.eat();  // concrete method from Animal
        rex.live(); // method from Animal that has override from interface ICreator

        System.out.println(rexSpeak + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        Spider piterParker = new Spider();
        String piterSpeak = piterParker.speak();
        piterParker.move();
        piterParker.eat();
        piterParker.live();

        System.out.println(piterSpeak + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);
    }
}
