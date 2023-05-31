package ua.com.itvdn.javaessencial.lecture1.classwork.ex5_static;

public class Main {

    private int count;

    public static void main(String[] args) {
        Main.doSome();
        doSome();

//        System.out.println(Main.count);

//        Main main = new Main();
//        System.out.println(main.count);
    }

    public static void doSome(){
        System.out.println("Hello");
    }
}
