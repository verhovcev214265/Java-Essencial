package ua.com.itvdn.javaessencial.lecture3.classwork.abstractclasses.ex4_Constructors;

import ua.com.itvdn.javaessencial.ITaskConstants;

public class Main {
    public static void main(String[] args) {

        AbstractClass instance = new ConcreteClass();

        System.out.println(ITaskConstants.DELIMITER);

        instance.abstractMethod();
    }
}
