package ua.com.itvdn.lecture9_generics.lab.task1;
public class MyClass <T> {

    private T field;

    public MyClass(T name){
        this.field = name;
    }

    public void show(){
        System.out.println(field.getClass());
    }
}
