package tests.stringbuffer;

public class SBfAndHisMethods {
    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer();

        System.out.println("Length = " + sbf.length());
        System.out.println("Capacity = " + sbf.capacity());

        System.out.println("Add string value: " + sbf.append("Hello"));
        System.out.println("Length = " + sbf.length());
        System.out.println("Capacity = " + sbf.capacity());
        System.out.println("Performing reverse: " + sbf.reverse());
        System.out.println("------------------------------------------------------------------------------------------");

        String str1 = "Naphanya has ";
        int paws = 4;
        String str2 = " paws";

        StringBuffer sbf2 = new StringBuffer(30);

        StringBuffer naphanya = sbf2.append(str1).append(paws).append(str2);
        System.out.println("Capacity = " + sbf2.capacity());
        System.out.println(naphanya);
        System.out.println("Revers_____________");
        naphanya.reverse();
        System.out.println(naphanya);
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Hello Git Interface`m here");

    }
}
