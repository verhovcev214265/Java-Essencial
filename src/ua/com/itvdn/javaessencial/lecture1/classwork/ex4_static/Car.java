package ua.com.itvdn.javaessencial.lecture1.classwork.ex4_static;

public class Car {

    private String model;
    private int speed;
    protected static int count;

    public Car(){
        count++;
    }

    public void showCount_A(){
        System.out.println("count = " + count);
    }

    public static void showCount_B(){
        System.out.println("Static count = " + count);
    }

//    public static void showModel(){
//        System.out.println(model);
//    }

    public static int getCount(){
        return count;
    }
}
