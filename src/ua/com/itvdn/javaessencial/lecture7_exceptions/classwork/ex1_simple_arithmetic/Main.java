package ua.com.itvdn.javaessencial.lecture7_exceptions.classwork.ex1_simple_arithmetic;

public class Main {
    public static void main(String[] args) {

        int numberA = 6;
        int numberB = 0;

        try {
            System.out.println(numberA / numberB);
        }catch (ArithmeticException e){
            System.out.println("Due, you shouldn't divide by zero!");
        }
    }
}
