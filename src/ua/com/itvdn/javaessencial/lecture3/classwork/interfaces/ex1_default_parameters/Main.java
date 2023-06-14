package ua.com.itvdn.javaessencial.lecture3.classwork.interfaces.ex1_default_parameters;

import ua.com.itvdn.javaessencial.ITaskConstants;

public class Main {
    public static void main(String[] args) {

        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.move();
        int mulResult = concreteClass.mul(2, 2);

        int addResult = ITest.add(10, 10);

        System.out.println(mulResult + ITaskConstants.NEW_LINE + addResult);

    }
}
