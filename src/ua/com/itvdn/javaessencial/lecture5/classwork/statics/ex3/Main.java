package ua.com.itvdn.javaessencial.lecture5.classwork.statics.ex3;

public class Main {
    public static void main(String[] args) {

        String baseMethod = BaseClass.staticMethod();
        String derivedMethod = DerivedClass.staticMethod();

        System.out.println(baseMethod + "\n" + derivedMethod);
    }
}
