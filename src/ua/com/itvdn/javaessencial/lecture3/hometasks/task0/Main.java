package ua.com.itvdn.javaessencial.lecture3.hometasks.task0;

import java.util.Scanner;

public class Main {

    public static final String BLACK_TEXT = "\u001B[30m";
    public static final String YELLOW_TEXT = "\u001B[33m";
    public static final String RED_TEXT = "\u001B[31m";

    public static void main(String[] args) {

        System.out.println(YELLOW_TEXT + "If you want work with: \nXML format enter 1.\nTXT enter 2.\n" +
                "DOC enter 3.\nIf you want to go out enter 0");

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        if (input == 0){
            System.out.println(BLACK_TEXT + "Bye - bye");
            return;
        }else if (input == 1){
            AbstractHandler xml = new XMLHandler();
            xml.create();
            xml.open();
            xml.change();
            xml.save();
        }else if (input == 2){
            AbstractHandler txt = new TXTHandler();
            txt.create();
            txt.open();
            txt.change();
            txt.save();
        }else if (input == 3){
            AbstractHandler doc = new DOCHandler();
            doc.create();
            doc.open();
            doc.change();
            doc.save();
        }else {
            System.out.println(RED_TEXT + "You enter incorrect symbol, please enter 1,2,3, or 0 for Exit.");
        }

    }
}
