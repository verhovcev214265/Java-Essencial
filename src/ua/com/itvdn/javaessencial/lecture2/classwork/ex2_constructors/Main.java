package ua.com.itvdn.javaessencial.lecture2.classwork.ex2_constructors;

class A {

    public int fieldA;

    public A(){
        System.out.println("Constructor A.");
    }
}

class B extends A{

    public int fieldB;

    public B(){
        fieldA = 10;
        System.out.println("Constructor B.");
    }
}

class C extends B{

    public int fieldC;

    public C(){

        System.out.println("Constructor C.");
    }
}

public class Main{

    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.fieldA);

        B b = new B();
        System.out.println(b.fieldA);

        C c = new C();
        System.out.println(c.fieldA);


    }
}

