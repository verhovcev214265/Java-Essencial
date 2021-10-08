package ua.com.itvdn.javaessencial.lecture2.tests;

public class A {
    int x = 1;

    public void printX() {
        System.out.println(getX());
    }

    public int getX() {
        return x;
    }
}

class B extends A {
    int x = 2;

    public int getX() {
        return x + 1;
    }
}

 class Main {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.x);
    }
}


