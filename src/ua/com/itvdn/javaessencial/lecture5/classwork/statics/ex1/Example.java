package ua.com.itvdn.javaessencial.lecture5.classwork.statics.ex1;

public class Example {

    private static int field;

    static {
        field = 10;
    }

    public static int getField(){
        return field;
    }

    public static void main(String[] args) {

        int result = Example.getField();
        System.out.println("Result = " + result);
    }
}
