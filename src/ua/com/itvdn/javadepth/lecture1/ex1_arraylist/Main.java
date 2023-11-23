package ua.com.itvdn.javadepth.lecture1.ex1_arraylist;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> instanceA = new ArrayList<>();
        instanceA.add(1);
        instanceA.add(2);
        instanceA.add(3);
        System.out.println("Size = " + instanceA.size() + "\ninstanceA: " + instanceA);

        instanceA.add(1, 250);
        System.out.println("Size = " + instanceA.size() + "\ninstanceA: " + instanceA);

        instanceA.remove(1);
        System.out.println("Size = " + instanceA.size() + "\ninstanceA: " + instanceA);

        for (int i = 0; i < 100; i++) {
            instanceA.add(10);
        }

        System.out.println("Size = " + instanceA.size() + "\ninstanceA: " + instanceA);

        // Capasity залишається незмінним
        for (int i = 0; i < 90; i++) {
            instanceA.remove(0);
        }
        //instance.subList(0, 90).clear();
        System.out.println("Size = " + instanceA.size() + "\ninstanceA: " + instanceA);

        instanceA.trimToSize();

        instanceA.set(1, 3);
        instanceA.set(2, 4);
        instanceA.set(3, 5);
        System.out.println(instanceA);

        List<Integer> instanceB = new ArrayList<>();
        instanceB.add(3);
        instanceB.add(4);
        instanceB.add(5);
        System.out.println("inatanceB " + instanceB + "\nsize = " + instanceB.size());

        instanceA.removeAll(instanceB);
        System.out.println(instanceA + "\ninatanceA +  size = " + instanceA.size());

        instanceA.clear();
        System.out.println(instanceA + "\ninatanceA size = " + instanceA .size());
    }
}
