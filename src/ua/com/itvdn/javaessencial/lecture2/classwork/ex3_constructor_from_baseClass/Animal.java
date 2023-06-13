package ua.com.itvdn.javaessencial.lecture2.classwork.ex3_constructor_from_baseClass;

public class Animal {

    private int weight;

    public Animal(){}

    public Animal(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return this.weight;
    }
}
