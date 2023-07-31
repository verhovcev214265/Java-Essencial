package ua.com.itvdn.javaessencial.lecture5.classwork.inner.ex3_inheritance;

public class Main {
    public static void main(String[] args) {

        SomeClass.InnerClass instance = new SomeClass().new InnerClass();

        System.out.println(
                        instance.methodBase() + "\n" +
                        instance.methodInner()
        );


        SomeClass someClass = new SomeClass();
//        someClass.methodBase();
//        someClass.methodInner();

    }
}
