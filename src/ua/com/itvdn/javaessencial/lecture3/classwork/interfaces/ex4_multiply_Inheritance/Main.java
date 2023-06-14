package ua.com.itvdn.javaessencial.lecture3.classwork.interfaces.ex4_multiply_Inheritance;

import ua.com.itvdn.javaessencial.ITaskConstants;

public class Main {
    public static void main(String[] args) {

        InterfaceA instanceA = new ConcreteClass();
        instanceA.methodA();
//        instanceA.methodB();  // why?
        System.out.println(ITaskConstants.DELIMITER);

        InterfaceB instanceB = new ConcreteClass();
        instanceB.methodB();
//        instanceB.methodA();   // why?
        System.out.println(ITaskConstants.DELIMITER);

        BaseClass instanceC = new BaseClass();
        instanceC.methodFromBase();
        System.out.println(ITaskConstants.DELIMITER);

        ConcreteClass instanceD = new ConcreteClass();
        instanceD.methodA();
        instanceD.methodB();
        instanceD.methodFromBase();
        System.out.println(ITaskConstants.DELIMITER);

        // UpCast

        BaseClass instanceE = (BaseClass) instanceD;

        InterfaceA instanceF = (InterfaceA) instanceD;

        InterfaceB instanceJ = (InterfaceB) instanceD;
    }
}
