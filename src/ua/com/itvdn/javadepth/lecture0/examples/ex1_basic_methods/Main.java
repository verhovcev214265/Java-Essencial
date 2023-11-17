package ua.com.itvdn.javadepth.lecture0.examples.ex1_basic_methods;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        Collection<Integer> instanceA = new ArrayList<>();
        instanceA.add(1);
        instanceA.add(2);
        instanceA.add(3);
        System.out.println(
                "before add() = " + instanceA.size() + "\n" +
                        "is add? -" + instanceA.add(4) + "\n" +
                        "after add = " + instanceA.size() + "\n" +
                        instanceA + "\n" +
                        "-----------------------------------------------------------------------------"
        );

        Collection<Integer> instanceB = new ArrayList<>();
        System.out.println("size = " + instanceB.size());
        instanceB.addAll(instanceA);
        System.out.println(
                "add previous list, size = " + instanceB.size() + "\n" +
                        instanceB + "\n" +
                        "-----------------------------------------------------------------------------"
        );

        Collection<Integer> instanceC = new ArrayList<>();
        instanceC.add(2);
        instanceC.add(3);

        instanceB.removeAll(instanceC);
        System.out.println(
                "We have used removeAll() \n" +
                        "is instanceB empty = " + instanceB.isEmpty() + "\n" +
                        "values in instanceB: " + instanceB + "\n"
        );

        instanceB.clear();
        System.out.println(
                "We have used clear() \n" +
                        "is instanceB empty = " + instanceB.isEmpty() + "\n" +
                        "values in instanceB: " + instanceB + "\n" +
                        "-----------------------------------------------------------------------------"
        );

        Object[] objects = instanceA.toArray();
        System.out.println("Collection instanceB has changed to array: ");
        for (int i = 0; i < objects.length; i++) {
            if (i < objects.length - 1) {
                System.out.print(objects[i] + ", ");
            } else {
                System.out.print(objects[i] + ".");

            }
        }
        System.out.println("\n-----------------------------------------------------------------------------");


    }
}
