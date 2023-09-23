package ua.com.itvdn.lecture9_generics.classwork.ex5_generics_in_methods;

public class MyGenMethod {

    public <T> void methodWithGen(T element){
        System.out.println(element);
    }

    public <T> T returnT(T element){
        return element;
    }

    public <String> String returnT2(String element){
        return element;
    }
}
