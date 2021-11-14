package tests.superclass.object.statics;

public class Animal {

    private String name;
    private int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name = '" + name + '\'' +
                "age = " + age + '}';
    }
}

class Cat extends Animal{

    private static String nameOfCat = "Naphanya";
    private static int ageOfCat = 15;

    Cat(){
       super("Naphanya", 10);
 //       super(nameOfCat, ageOfCat);
    }

    @Override
    public String toString(){
        return "Cat{" +
                "nameOfCat = '" + nameOfCat + '\'' +
                ". ageOfCat = " + ageOfCat + '}';

    }
}
