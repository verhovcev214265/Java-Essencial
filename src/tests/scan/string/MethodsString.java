package tests.scan.string;

import java.util.Arrays;

public class MethodsString {
    public static void main(String[] args) {

        String oleksandr = "Oleksandr";
        String horianinskyi = " Horianinskyi";
        String s = "Hello";

        long id = 3299519476L;

        String[] dataForOleksandr = new String[10];
        dataForOleksandr[0] = oleksandr;
        dataForOleksandr[1] = horianinskyi;

        System.out.println(s);
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println(s.charAt(1));
        System.out.println(Arrays.toString(s.getBytes()));
        System.out.println("----------------------------------------------------------------------------------------");

        String oh = oleksandr.concat(horianinskyi);
        System.out.println(oh);
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println(oleksandr.compareToIgnoreCase(horianinskyi));
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println();
        System.out.println(oleksandr.substring(4,6));
        System.out.println(dataForOleksandr[0].substring(0,4));
        System.out.println(dataForOleksandr[0].substring(4));
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println(oleksandr.startsWith("O"));
        System.out.println(oleksandr.startsWith("o"));
        System.out.println(oleksandr.startsWith("y"));
        System.out.println();
        System.out.println(oleksandr.endsWith("r"));
        System.out.println(oleksandr.endsWith("R"));
        System.out.println(oleksandr.endsWith("z"));
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println(oleksandr.length());
        System.out.println(horianinskyi.length());
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println(oleksandr.indexOf("O"));
        System.out.println(horianinskyi.indexOf("i"));
        System.out.println(horianinskyi.indexOf("y"));
        System.out.println("----------------------------------------------------------------------------------------");

        String idString =  String.valueOf(id);
        System.out.println(idString);
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println(oleksandr.toUpperCase());
        System.out.println(horianinskyi.toLowerCase());
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println(oleksandr.replace("s", "z".toUpperCase()));
        System.out.println(horianinskyi.replaceAll("i", "e".toUpperCase()));
        System.out.println("----------------------------------------------------------------------------------------");

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);
        System.out.println("----------------------------------------------------------------------------------------");

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str3.intern());
        System.out.println(str2 == str4);
        System.out.println(str2 == str4.intern());
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println(horianinskyi);
        System.out.println(horianinskyi.trim());
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println(oleksandr.charAt(0));
        System.out.println(oleksandr.charAt(1));
        System.out.println(oleksandr.charAt(2));
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println(horianinskyi.isEmpty());
        String empty = "";
        System.out.println(empty.isEmpty());
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println(oleksandr);
        System.out.println();

        byte[] bytesOleksandr = oleksandr.getBytes();

        for (int i = 0; i < bytesOleksandr.length; i++) {
            System.out.print(bytesOleksandr[i] + " ");
        }
        System.out.println("\n----------------------------------------------------------------------------------------");

        String aStr = "world";
        int aInt = 20;

        System.out.println(String.format("Hello, %s on line %d", aStr,aInt));
        System.out.println("\n----------------------------------------------------------------------------------------");

    }
}
