package ua.com.itvdn.javaessencial.lecture6.classwork.anonimus.ex3_class;

public class Main {

    // Why we can't see this field into anonymous class.
    private static final int field = 112;

    public static void main(String[] args) {

        Example example = new Example() {

//          static int num;  // can't create static fields

            int sum = 19;
//            sum = 25;      // effective final
            static final int age = 18;

            private static final String season = "Summer";

            public int addTenToSum(){
                sum = 20;
                return sum + 10;
            }

            // We can see this method only into anonymous class
            public String myMethod() {
                return "Method from anonymous class.";
            }

            // We can see this method only into anonymous class
            public int addToNumber(int number) {
                return number + 10;
            }

            @Override
            public String sayHello() {
                return "Hello anonymous." +
                        "\n" + myMethod() +
                        "\n" + addToNumber(15) +
                        "\nage = " + age +
                        "\nsum = " + addTenToSum();
            }

        };
        System.out.println(example.sayHello() + "\n" + example.getClass());
//        System.out.println(example.myMethod + "\n" + example.addToNumber);

    }

}
