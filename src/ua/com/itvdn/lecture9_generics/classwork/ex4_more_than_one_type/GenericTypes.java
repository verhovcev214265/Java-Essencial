package ua.com.itvdn.lecture9_generics.classwork.ex4_more_than_one_type;

public class GenericTypes <T1, T2>{

    private T1 elementA;
    private T2 elementB;

    public GenericTypes(T1 elementA, T2 elementB){
        this.elementA = elementA;
        this.elementB = elementB;
    }

    public T1 getElementA(){
        return elementA;
    }

    public T2 getElementB(){
        return elementB;
    }
}
