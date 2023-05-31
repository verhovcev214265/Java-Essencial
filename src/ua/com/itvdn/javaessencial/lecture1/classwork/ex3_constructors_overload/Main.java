package ua.com.itvdn.javaessencial.lecture1.classwork.ex3_constructors_overload;

public class Main {
    public static void main(String[] args) {

        Animal animalA = new Animal();
        System.out.println("Age = " + animalA.getAge() + ", " + animalA.getHeight());

        Animal animalB = new Animal(17);
        System.out.println("Age = " + animalB.getAge() + ", " + animalB.getHeight());

        Animal animalC = new Animal(18, 123);
        System.out.println("Age = " + animalC.getAge() + ", " + animalC.getHeight());

    }
}
