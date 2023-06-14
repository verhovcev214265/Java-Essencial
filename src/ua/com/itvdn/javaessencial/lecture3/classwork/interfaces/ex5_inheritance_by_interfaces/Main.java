package ua.com.itvdn.javaessencial.lecture3.classwork.interfaces.ex5_inheritance_by_interfaces;

import ua.com.itvdn.javaessencial.ITaskConstants;

public class Main {
    public static void main(String[] args) {

        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.methodA();
        concreteClass.methodB();

        System.out.println(ITaskConstants.DELIMITER);

        InterfaceA interfaceA = (InterfaceA) concreteClass;
        interfaceA.methodA();

        System.out.println(ITaskConstants.DELIMITER);

        InterfaceB interfaceB = (InterfaceB) concreteClass;
        interfaceB.methodA();
        interfaceB.methodB();

        int a = 10;
        byte b = (byte) a;
    }
}
