package ua.com.itvdn.lecture9_generics.classwork.ex3_differnt_between_generic_and_object;

public class WithGeneric<T> {

    private final T element;

    public WithGeneric(T element){
        this.element = element;
    }

    public T getElement(){
        return element;
    }

    @Override
    public String toString(){
        return "WithGeneric: " +
                "element = " + element + ".";
    }
}
