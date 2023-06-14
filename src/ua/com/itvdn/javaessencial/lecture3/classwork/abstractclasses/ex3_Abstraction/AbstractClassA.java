package ua.com.itvdn.javaessencial.lecture3.classwork.abstractclasses.ex3_Abstraction;

abstract class AbstractClassA {

    public abstract void methodA();
}

abstract class AbstractClassB extends AbstractClassA {

    /*
    Якщо абстрактний клас успадковується від іншого абстрактного класу, він не зобов'язаний перевизначати абстрактні методи
    свого базового класу!
    Але це можно зробити за бажанням.
     */

    public abstract void methodB();
}

class ConcreteClass extends AbstractClassB {

    /*
    При успадкуванні конкретний клас зобов'язаний перевизначити абстрактні методи як свого базового класу так і всі
    абстрактні методи базового класу від якого успадкований його базовий клас.
     */

    @Override
    public void methodA() {
        System.out.println("Realisation method from AbstractClassA");
    }

    @Override
    public void methodB() {
        System.out.println("Realisation method from AbstractClassB");
    }
}