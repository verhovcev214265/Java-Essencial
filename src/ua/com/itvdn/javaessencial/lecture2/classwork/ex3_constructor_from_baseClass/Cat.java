package ua.com.itvdn.javaessencial.lecture2.classwork.ex3_constructor_from_baseClass;

public class Cat extends Animal{

    private String name;
    private String breed;

    public Cat(){}

    public Cat(int weight, String name, String breed){
        super(weight);
//        this();
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
}
