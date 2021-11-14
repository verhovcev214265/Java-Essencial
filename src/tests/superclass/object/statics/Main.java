package tests.superclass.object.statics;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Barsuk", 999);
        Cat cat = new Cat();

        System.out.println(animal + " " + cat);
    }
}
