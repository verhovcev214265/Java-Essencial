package ua.com.itvdn.lecture9.hometasks.task2;

public class Main {
    public static void main(String[] args) {

        MyDictionary<String, String> myDictionary = new MyDictionary();

        myDictionary.addKV("Привіт", "Hello");
        myDictionary.addKV("Світ", "World");
        System.out.println(myDictionary.dictionary);

        System.out.println(myDictionary.keyIndex("Привіт"));
        System.out.println(myDictionary.lengthDictionary());

    }
}
