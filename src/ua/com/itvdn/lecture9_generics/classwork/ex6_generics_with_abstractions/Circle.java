package ua.com.itvdn.lecture9_generics.classwork.ex6_generics_with_abstractions;

public class Circle extends Shape{

    private final String name;

    public Circle(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Circle: " +
                "name = " + name + ".";
    }
}
