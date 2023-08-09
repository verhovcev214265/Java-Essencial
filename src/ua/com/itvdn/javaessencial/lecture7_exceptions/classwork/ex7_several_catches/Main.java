package ua.com.itvdn.javaessencial.lecture7_exceptions.classwork.ex7_several_catches;

public class Main {
    public static void main(String[] args) {

        int argA = 10;
        int argB = 2;

        int[] arr = {1, 2, 3, 4, 5};

        try {
            System.out.println(argA / argB + "\n" + arr[5]);
        }catch (ArithmeticException e){
            System.out.println("Due you mustn't divided by zero.");
        }catch (IndexOutOfBoundsException e){
            System.out.println("You try to call non-exist index");
        }catch (Exception e){ // if put to first place?
            System.out.println("Exception");
        }
    }
}
