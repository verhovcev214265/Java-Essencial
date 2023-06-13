package ua.com.itvdn.javaessencial.lecture2.classwork.ex1_how_to_work_extends;

public class Main {
    public static void main(String[] args) {

        B b = new B();

        b.setFieldA(14);
        b.setFieldB("hello");

        System.out.println("fieldA = " + b.getFieldA() + "\nfieldB: " + b.fieldB + "\nMethod: " +  b.show());

    }
}
