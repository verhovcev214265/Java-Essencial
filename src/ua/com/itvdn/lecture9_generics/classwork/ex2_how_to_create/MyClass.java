package ua.com.itvdn.lecture9_generics.classwork.ex2_how_to_create;

public class MyClass<T> {

    private T field;

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

    /*
    private static T value;
    T t = new T();
    T[] t2 = new T[10];
    */
}
