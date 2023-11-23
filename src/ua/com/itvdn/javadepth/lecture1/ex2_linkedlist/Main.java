package ua.com.itvdn.javadepth.lecture1.ex2_linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> instanceA = new LinkedList<>();
        instanceA.add(1);
        instanceA.add(2);
        instanceA.add(3);
        System.out.println(instanceA + "\nsize = " + instanceA.size());

        instanceA.add(2, 333);
        System.out.println(instanceA + "\nsize = " + instanceA.size());

        instanceA.add(null);
        System.out.println(instanceA + "\nsize = " + instanceA.size());

        instanceA.add(2, null);
        System.out.println("fourth index = " + instanceA.get(4) + "\n" + instanceA + "\nsize = " + instanceA.size());

        instanceA.remove(2);
        System.out.println(instanceA + "\nsize = " + instanceA.size());

        for (int i = 0; i < 100; i++) {
            instanceA.add(7);
        }
        System.out.println("instanceA: " + instanceA + "\nsize = " + instanceA.size());

        //        instance.subList(0, 90);
        for (int i = 0; i < 90; i++) {
            instanceA.remove(0);
        }
        System.out.println("instanceA: " + instanceA + "\nsize = " + instanceA.size());

//        ((LinkedList<Integer>) instance).trimToSize(); it doesn't array and therefore we can't use method trimToSize()

        instanceA.set(1, 3);
        instanceA.set(2, 4);
        instanceA.set(3, 5);
        System.out.println("instanceA: " + instanceA + "\nsize = " + instanceA.size());

        LinkedList<Integer> instanceB = new LinkedList<>();
        instanceB.add(3);
        instanceB.add(4);
        instanceB.add(5);

        instanceA.removeAll(instanceB);
        System.out.println("instanceA: " + instanceA + "\nsize = " + instanceA.size());

        instanceA.clear();
        System.out.println("instanceA: " + instanceA + "\nsize = " + instanceA.size());

        LinkedList<Integer> instanceC = new LinkedList<>();
        instanceC.add(1);
        instanceC.add(2);
        instanceC.add(2);
        instanceC.add(3);
        System.out.println(
                "instanceC first element = " + instanceC.getFirst() +
                        "\ninstanceC: " + instanceC + "\nsize = " + instanceC.size() +
                        "\nlastIndexOf = " + instanceC.lastIndexOf(2) +
                        "\ninstanceC: " + instanceC +
                        "\nsize = " + instanceC.size() +
                        "\nofferFirst = " + instanceC.offerFirst(100) +
                        "\ninstanceC: " + instanceC +
                        "\nsize = " + instanceC.size() +
                        "\nremoveLast = " + instanceC.removeLast() +
                        "\ninstanceC: " + instanceC +
                        "\nsize = " + instanceC.size()
        );
    }
}
