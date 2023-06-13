package ua.com.itvdn.javaessencial.lecture2.classwork.ex4_methods;

public class DerivedClass extends BaseClass{

    @Override
    public String sayHello(){
        super.sayHello();
        return "Hello from DerivedClass!";
    }
}
