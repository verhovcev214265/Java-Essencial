package ua.com.itvdn.javaessencial.lecture4.classwork.class_arrays.ex1_methods;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {

        int[] numbersA = {2, 12, 3, 124, 55, 22};

        int[] numbersB = {56, 78, 23};

        int[] numbersC = {2, 12, 3, 124, 55, 22};
        Arrays.sort(numbersC);

        for (int i = 0; i < numbersA.length; i++) {
            if (i != numbersA.length - 1) System.out.print(i + ", ");
            else System.out.print(i + ".");
        }

        // Sorting array
        Arrays.sort(numbersA);

        // Output array
        System.out.println("\n" + Arrays.toString(numbersA));

        // To find position on value
        System.out.println(Arrays.binarySearch(numbersA, 124));

        // comparison
        System.out.println(Arrays.equals(numbersA, numbersB) + ", " + Arrays.equals(numbersA, numbersC));

        // Filling array
        Arrays.fill(numbersB, 999);
        System.out.println(Arrays.toString(numbersB));

    }
}
