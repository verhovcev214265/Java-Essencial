package ua.com.itvdn.javaessencial.lecture3.classwork.interfaces.ex5_inheritance_by_interfaces;

public class ConcreteClass implements InterfaceB{
    @Override
    public void methodA() {
        System.out.println("Realisation methodA from InterfaceA");
    }

    @Override
    public void methodB() {
        System.out.println("Realisation methodB from InterfaceB");
    }
}
