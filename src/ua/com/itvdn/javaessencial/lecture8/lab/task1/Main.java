package ua.com.itvdn.javaessencial.lecture8.lab.task1;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal vasika = new Animal("Vasika", 45, false);
        Animal vasika2 = new Animal("Vasika", 45, false);
        Animal naphanya = new Animal("Naphanya", 3, true);

        List<Animal> animals = new ArrayList<>(3);
        animals.add(vasika);
        animals.add(vasika2);
        animals.add(naphanya);

        System.out.println(animals);
        System.out.println("==================================================================");

        System.out.println(vasika.equals(vasika2));
        System.out.println(vasika.equals(naphanya));
    }
}
