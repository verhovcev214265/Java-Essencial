package ua.com.itvdn.lecture9.lab.task0;

public class Main {
    public static void main(String[] args) {

        MyClass.factoryMethod(new String("Hello"));
        MyClass.factoryMethod(12345.0);
        MyClass.factoryMethod(123);
        MyClass.factoryMethod('h' + 'e' + 'l' + 'l' + 'o');
    }
}
