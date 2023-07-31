package ua.com.itvdn.javaessencial.lecture5.classwork.nested.ex1;

public class Outer {

    int yearProduction = 10;
    private static int volume = 8;

    static class Nested {

        // effective final principe
        int maxSpeed = 200;

        static int price;

        public void show() {
//          System.out.println("Outer = " + Outer.this + "\n" + "yearProduction = " + yearProduction);

            System.out.println(
                    "Nested = " + this + "\n" +
                            "volume = " + volume + "\n" +
                            "maxSpeed = " + maxSpeed + "\n" +
                            "price = " + price

            );
        }

        static void show2(){
//            System.out.println(
//                    "Nested = " + this + "\n" +
//                            "volume = " + volume + "\n" +
//                            "maxSpeed = " + maxSpeed + "\n" +
//                            "price = " + price
//
//            );
        }
    }

}
