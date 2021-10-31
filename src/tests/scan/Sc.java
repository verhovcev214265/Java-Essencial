package tests.scan;

import java.util.Scanner;

public class Sc {
    public static void main(String[] args) {

        String input = "abc 123 defa 456";

        Scanner scan = new Scanner(input).useDelimiter("\\s* abc \\s*");

        System.out.println(scan.nextInt());
        System.out.println(scan.nextInt());

        System.out.println(scan.next());
        System.out.println(scan.next());

        scan.close();
    }
}
