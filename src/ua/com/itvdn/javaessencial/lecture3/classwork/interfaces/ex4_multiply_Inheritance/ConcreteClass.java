package ua.com.itvdn.javaessencial.lecture3.classwork.interfaces.ex4_multiply_Inheritance;

public class ConcreteClass extends BaseClass implements InterfaceA, InterfaceB{
    @Override
    public void methodA() {
        System.out.println("Realisation methodA from InterfaceA");
    }

    @Override
    public void methodB() {
        System.out.println("Realisation methodB from InterfaceB");
    }

    @Override
    public void methodFromBase(){
        System.out.println("Realisation methodFromBase from BaseClass into ConcreteClass");
    }
}
