package ua.com.itvdn.javaessencial.lecture3.classwork.abstractclasses.ex3_Abstraction;

public class Main {
    public static void main(String[] args) {

        AbstractClassA instanceA = new ConcreteClass();
        instanceA.methodA();

//        instanceA.methodB();    // Why we can't call the method?
    }
}
