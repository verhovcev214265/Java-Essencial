package ua.com.itvdn.javaessencial.lecture2.classwork.ex7_Inheritance;

public class Main {
    public static void main(String[] args) {

        DerivedClass derived_A = new DerivedClass();

        derived_A.setField_A(1);  // from Base
        derived_A.setField_B(2);  // from Base

        derived_A.setField_C(3);  // from Derived
        derived_A.setField_D(4);  // from Derived
        derived_A.setField_E(5);  // from Derived

        BaseClass base_A = (BaseClass) derived_A; // UpCast

        base_A.setField_A(1);
        base_A.setField_B(2);

        DerivedClass derived_B = (DerivedClass) base_A;

//        base.setField_C(3);
//        base.setField_D(4);
//        base.setField_E(5);
        System.out.println("hashCode derived = " + derived_A.hashCode() +
                "\nhashCode base = " + base_A.hashCode() +
                "\nhasCode derived2 = " + derived_B.hashCode()
        );

        BaseClass base_B = new BaseClass();

//        DerivedClass derived_C = (DerivedClass) base_B;
//        System.out.println(derived_C.hashCode());

    }
}
