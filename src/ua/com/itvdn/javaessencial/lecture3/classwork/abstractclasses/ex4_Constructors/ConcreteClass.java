package ua.com.itvdn.javaessencial.lecture3.classwork.abstractclasses.ex4_Constructors;

public class ConcreteClass extends AbstractClass {

    String field = "First";


// Конструктор відпрацьовує 2-им
    public ConcreteClass() {
        System.out.println("3 ConcreteClass()");
        field = "Second";
    }

    @Override
    public void abstractMethod() {
        System.out.println("Realisation abstractMethod into ConcreteClass " + field);
    }
}
