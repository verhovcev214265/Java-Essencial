package ua.com.itvdn.lecture9_generics.classwork.ex2_how_to_create;

public class Main {

    public static void main(String[] args) {

        MyClass<String> myClassStr = new MyClass<>();
        myClassStr.setField("Hello!");

        MyClass<Integer> myClassInt = new MyClass<>();
        myClassInt.setField(1234);

        /*
        Generics не працюють з примітивами!
        MyClass<int> myClass_int = new MyClass<>();
        myClass_int.setField(1234);
         */

        System.out.println(
                "myClassStr: " + myClassStr.getField().getClass() +
                "\nmyClassInt: " + myClassInt.getField().getClass()
        );

    }
}
