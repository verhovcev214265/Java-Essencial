package ua.com.itvdn.javaessencial.lecture4.classwork.class_arrays.ex2_methods;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {

        int[] numbersA = {1, 1, 1, 1, 1};
        int[] numbersB = {2, 2, 2, 2, 2};

        // Special method for copy to another array (from class System)
        System.arraycopy(numbersA, 2, numbersB, 2, 3);
        System.out.println(Arrays.toString(numbersB));

        String[] namesA = {"Bob", "Bob", "Bob", "Bob", "Bob"};

        String[] namesB = Arrays.copyOf(namesA, 6);
        System.out.println(Arrays.toString(namesB));

    }
}
