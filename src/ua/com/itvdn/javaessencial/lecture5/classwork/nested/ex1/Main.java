package ua.com.itvdn.javaessencial.lecture5.classwork.nested.ex1;

public class Main {

    static class NestedClassMain{}

    public static void main(String[] args) {

        Outer.Nested nested = new Outer.Nested();
        nested.show();

        NestedClassMain nestedClassMain = new NestedClassMain();
    }
}
