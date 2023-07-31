package ua.com.itvdn.javaessencial.lecture6.classwork.anonimus.ex2_by_anonymous;

public class Main {
    public static void main(String[] args) {

        ITest classA = new ITest() {
            @Override
            public String sayHello() {
                return "Hello classA";
            }
        };

        ITest classB = new ITest() {
            @Override
            public String sayHello() {
                return "Hello classB";
            }
        };

        // lambda
        ITest classC = () -> "Hello classC";

        System.out.println(classA.sayHello() + "\n" + classB.sayHello() + "\n" + classC.sayHello());

        ITest[] iTests = {classA, classB, classC};

        for (ITest iTest : iTests) {
            System.out.print(iTest.sayHello() + "\n");
        }

    }
}
