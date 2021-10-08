package ua.com.itvdn.javaessencial.lecture2.hometask.task4;

import java.util.Scanner;

public class Main {

    static final int PRO_KEY = 2525;
    static final int EXPERT_KEY = 4545;

    public static void main(String[] args) {

        System.out.println("If you don`t have any keys enter: 1.\n" +
                           "If you have Pro or Expert key enter it: ");

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        switch (input){
            case (1):
                DocumentWorker worker = new DocumentWorker();
                worker.openDocument();
                worker.editDocument();
                worker.saveDocument();
                break;
            case (PRO_KEY):
                DocumentWorker pro = new  ProDocumentWorcker();
                pro.openDocument();
                pro.editDocument();
                pro.saveDocument();
                break;
            case (EXPERT_KEY):
                DocumentWorker expert = new ExpertDocumentWorker();
                expert.openDocument();
                expert.editDocument();
                expert.saveDocument();
                break;
            default:
                System.out.println("You entered incorrect symbol. Try again");

        }
    }
}
