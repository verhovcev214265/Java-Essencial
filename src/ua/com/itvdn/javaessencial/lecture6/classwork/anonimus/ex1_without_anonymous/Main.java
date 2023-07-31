package ua.com.itvdn.javaessencial.lecture6.classwork.anonimus.ex1_without_anonymous;

public class Main {
    public static void main(String[] args) {

        ClassA classA = new ClassA();
        ClassB classB = new ClassB();
        ClassC classC = new ClassC();

        System.out.println(classA.sayHello() + "\n" + classB.sayHello() + "\n" + classC.sayHello());


    }
}
