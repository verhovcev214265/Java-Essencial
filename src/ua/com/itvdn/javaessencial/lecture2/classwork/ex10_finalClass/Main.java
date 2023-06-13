package ua.com.itvdn.javaessencial.lecture2.classwork.ex10_finalClass;

// Не можна успадковуватись від final класу.

final class FinalClass {

    public int field_A;
    public int field_B;
}

class Derived{ // extends FinalClass --> (compile error)

}

public class Main{
    public static void main(String[] args) {

        FinalClass finalClass = new FinalClass();
        finalClass.field_A = 100;
        finalClass.field_B = 200;

        System.out.println("field_A = " + finalClass.field_A + ", field_B = " + finalClass.field_B);
    }

}

