package ua.com.itvdn.javaessencial.lecture2.classwork.ex6_UpDownCast;

public class Main {
    public static void main(String[] args) {

        BaseClass instance_A = new DerivedClass();
        DerivedClass instance_B = (DerivedClass) instance_A;

        DerivedClass derivedClass = new DerivedClass();
        BaseClass baseClass = derivedClass;

        //ClassCastException
        BaseClass base = new BaseClass();
        DerivedClass derived = (DerivedClass) base;

        System.out.println(derived);


    }
}
