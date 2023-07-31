package ua.com.itvdn.javaessencial.lecture5.classwork.inner.ex1_inner;

public class OuterClass {

    //Outer classes should be just public or package(default)

    private int speed = 220;
    private static int volume = 12;
    private InnerClass innerClass;  // Can create

    // Inner classes may have all modification (strictfp)

    public void createInner(){
        InnerClass inner = new InnerClass();
        inner.show();
    }

    class InnerClass {
        int numbersOfPassengers = 8;

/*
        numbersOfPassengers = 7; (effective final)
        static int price;
        static void show(){}
 */

        void show(){
            System.out.println(
                    "Outer class = " + OuterClass.this + "\n" +
                    "Inner class = " + this + "\n" +
                    "speed = " + speed + "\n" +
                    "volume = " + volume + "\n" +
                    "numbersOfPassengers = " + numbersOfPassengers
            );
        }
    }

}
