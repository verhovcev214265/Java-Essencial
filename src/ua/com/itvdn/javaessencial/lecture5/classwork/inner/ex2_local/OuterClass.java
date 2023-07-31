package ua.com.itvdn.javaessencial.lecture5.classwork.inner.ex2_local;

public class OuterClass {

    private int speed = 220;
    private static int volume = 12;

    public void createInner() {

        class InnerClass {
            int numbersOfPassengers = 8;

/*
        numbersOfPassengers = 7; (effective final)
        static int price;
        static void show(){}
 */

            void show() {
                System.out.println(
                        "Outer class = " + OuterClass.this + "\n" +
                                "Inner class = " + this + "\n" +
                                "speed = " + speed + "\n" +
                                "volume = " + volume + "\n" +
                                "numbersOfPassengers = " + numbersOfPassengers
                );
            }
        }

        InnerClass inner = new InnerClass();
        inner.show();
    }
}
