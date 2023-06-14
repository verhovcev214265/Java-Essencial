package ua.com.itvdn.javaessencial.lecture3.classwork.interfaces.ex1_default_parameters;

public class ConcreteClass implements ITest {

    @Override
    public void move() {
        System.out.println("Interface can move"); // We must override all interface's methods!!!
    }

    //    This isn't usefully, but we can do it.
    @Override
    public int mul(int valueA, int valueB) {
        return ITest.super.mul(valueA, valueB);
    }
}
