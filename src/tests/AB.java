package tests;

public class AB {
    public static void main (String [] args) {
        System.out.print ("A");
        main ("java7");
    }
    private static void main (String args) {
        System.out.print ("B");
    }
}
