package ua.com.itvdn.javaessencial.lecture2.classwork.ex4_methods;

public class Main {
    public static void main(String[] args) {

        BaseClass baseClass = new BaseClass();
        String helloBase = baseClass.sayHello();

        DerivedClass derivedClass = new DerivedClass();
        String helloDerived = derivedClass.sayHello();

        System.out.println(helloBase + "\n" + helloDerived);
    }
}
