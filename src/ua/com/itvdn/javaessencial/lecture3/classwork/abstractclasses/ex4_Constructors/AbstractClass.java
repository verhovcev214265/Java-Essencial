package ua.com.itvdn.javaessencial.lecture3.classwork.abstractclasses.ex4_Constructors;

public abstract class AbstractClass {

    // Конструктор відпрацьовує 1-им
    public AbstractClass() {
        System.out.println("1 AbstractClass()");

        // Викликається реалізація метода від дочірнього класу
        this.abstractMethod();

        System.out.println("2 AbstractClass()");
    }

    public abstract void abstractMethod();
}
