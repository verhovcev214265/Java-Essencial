package ua.com.itvdn.javaessencial.lecture3.classwork.abstractclasses.ex2_Abstraction;

public class Main {
    public static void main(String[] args) {

        ConcreteClassA instance = new ConcreteClassB();
        instance.methodFromConcrete();

        AbstractClass instance2 = new ConcreteClassB();
        instance2.abstractMethod();
        instance2.methodFromConcrete();
    }
}
