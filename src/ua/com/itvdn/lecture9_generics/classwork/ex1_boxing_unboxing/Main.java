package ua.com.itvdn.lecture9_generics.classwork.ex1_boxing_unboxing;

public class Main {
    public static void main(String[] args) {
        // Boxing
        Integer i = 10; // Integer i = new Integer(10)
        // Unboxing
        int t = i;

        System.out.println("i = " + i.getClass() + ": " + i + "\n" + "t = " + t);
    }
}
