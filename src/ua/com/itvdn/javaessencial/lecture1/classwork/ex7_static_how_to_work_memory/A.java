package ua.com.itvdn.javaessencial.lecture1.classwork.ex7_static_how_to_work_memory;

public class A {
    public A(){
        System.out.println("Constructor class A");
    }

    {
        System.out.println("Dynamic block 1");
    }

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Dynamic block 2");
    }
}
