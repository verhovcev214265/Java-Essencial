package ua.com.itvdn.lecture9_generics.classwork.ex3_differnt_between_generic_and_object;

public class WithOutGeneric {
    private Object element;

    public WithOutGeneric(Object element){
        this.element = element;
    }

    public Object getElement(){
        return element;
    }

    @Override
    public String toString(){
        return "WithOutGeneric: " +
                "element = " + element + ".";
    }
}
