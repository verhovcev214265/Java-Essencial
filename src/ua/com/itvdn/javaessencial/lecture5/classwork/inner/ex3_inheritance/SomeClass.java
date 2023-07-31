package ua.com.itvdn.javaessencial.lecture5.classwork.inner.ex3_inheritance;

// Успадкування внутрішнього класу ніяк не розповсюджується на зовнішній клас.
public class SomeClass {

    public class InnerClass extends BaseClass{

        public String methodInner(){
            return "This method from Inner that extends BaseClass";
        }
    }
}
