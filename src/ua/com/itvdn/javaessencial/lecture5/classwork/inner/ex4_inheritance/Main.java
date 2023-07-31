package ua.com.itvdn.javaessencial.lecture5.classwork.inner.ex4_inheritance;

public class Main {
    public static void main(String[] args) {

        BaseClass base = new BaseClass();
        base.methodBase();

        SomeClass.Inner inner = new SomeClass().new Inner();
//        inner.methodBase();  // Успадкування зовнішнього класу ніяк не розповсюджується на внутрішній клас.
        inner.methodInner();
    }
}
