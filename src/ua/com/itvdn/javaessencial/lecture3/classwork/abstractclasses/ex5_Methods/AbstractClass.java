package ua.com.itvdn.javaessencial.lecture3.classwork.abstractclasses.ex5_Methods;

public abstract class AbstractClass {

    // Метод з абстрактного класу передається дочірньому класу так само як і від звичайного(конкретного класу)
    public void method(){
        System.out.println("Concrete method from AbstractClass");
    }

    // Абстрактний метод обов'язково реалізується у дочірньому класі
    public abstract void abstractMethod();
}
