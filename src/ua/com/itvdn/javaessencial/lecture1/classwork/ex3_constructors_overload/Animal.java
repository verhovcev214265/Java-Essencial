package ua.com.itvdn.javaessencial.lecture1.classwork.ex3_constructors_overload;

public class Animal {

    private int age;
    private int height;

    public Animal(){
        this(15, 43);
    }

    public Animal(int age){
        this(age, 23);
    }

    public Animal(int age, int height){
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
