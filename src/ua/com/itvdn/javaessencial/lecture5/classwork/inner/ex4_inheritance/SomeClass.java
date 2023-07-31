package ua.com.itvdn.javaessencial.lecture5.classwork.inner.ex4_inheritance;

public class SomeClass extends BaseClass{

    public class Inner{

        public String methodInner(){
            return "This method from Inner that not to extended by BaseClass";
        }
    }
}
