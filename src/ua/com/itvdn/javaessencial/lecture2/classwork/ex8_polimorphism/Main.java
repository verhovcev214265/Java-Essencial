package ua.com.itvdn.javaessencial.lecture2.classwork.ex8_polimorphism;

public class Main {
    public static void main(String[] args) {

        BaseClass instanceBase = new BaseClass();
        String fromInstanceBase = instanceBase.methodFromBase();

        DerivedClass instance = new DerivedClass();
        String fromInstance = instance.methodFromBase();

        BaseClass instanceUp = instance;
        String fromInstanceUp = instanceUp.methodFromBase();

        DerivedClass instanceDown = (DerivedClass) instanceUp;
        String fromInstanceDown = instanceDown.methodFromBase();

        System.out.println(fromInstanceBase + "\n" + fromInstance + "\n" + fromInstanceUp + "\n" + fromInstanceDown);
    }
}
