package ua.com.itvdn.javaessencial.lecture5.classwork.statics.ex2;

public class NonStaticClass {

    // Викликається лише при створенні об'єкта від цього класу
    public NonStaticClass(){
        System.out.println("Constructor.");
    }

    /*
    Викликається у будь-якому випадку, тобто під час звернення до статичного члену так і під час створення екземпляра
    даного класу.
     */
    static {
        System.out.println("Static block.");
    }

    // Відпрацює однаково для всіх екземплярів даного класу. (Не можемо перевизначати)
    public static void staticMethod(){
        System.out.println("Static method.");
    }

    // Можемо перевизначати у класах спадкоємцях.
    public void method(){
        System.out.println("Simple method");
    }
}
