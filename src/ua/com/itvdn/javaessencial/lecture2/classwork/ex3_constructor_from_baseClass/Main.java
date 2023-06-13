package ua.com.itvdn.javaessencial.lecture2.classwork.ex3_constructor_from_baseClass;

public class Main {
    public static void main(String[] args) {

        Cat barsic = new Cat(5, "Barsic", "Maine Coon");
        Cat tom = new Cat(12, "Tom", "Angore");

        System.out.println("Name: " + barsic.getName() + ", breed: " + barsic.getBreed() + ", weight = " + barsic.getWeight() + "\n" +
                "Name: " + tom.getName() + ", breed: " + tom.getBreed() + ", weight = " + tom.getWeight()
        );

    }
}
