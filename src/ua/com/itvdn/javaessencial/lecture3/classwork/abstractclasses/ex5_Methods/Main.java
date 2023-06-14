package ua.com.itvdn.javaessencial.lecture3.classwork.abstractclasses.ex5_Methods;

public class Main {
    public static void main(String[] args) {

        AbstractClass instanceUp = new ConcreteClass();
        instanceUp.method();
        instanceUp.abstractMethod();

        ConcreteClass instance = new ConcreteClass();
        instance.method();
        instance.abstractMethod();
    }
}
