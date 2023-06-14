package ua.com.itvdn.javaessencial.lecture3.classwork.abstractclasses.ex5_Methods;

public class ConcreteClass extends AbstractClass{

    // Якщо конкретний метод не перевизначити в дочірньому класі тоді його реалізація буде така сама як і в базовому абстрактному класі
    @Override
    public void method(){
        System.out.println("Concrete method from AbstractClass with realisation into ConcreteClass");
    }

    @Override
    public void abstractMethod() {
        System.out.println("Abstract method from AbstractClass with realisation into ConcreteClass");
    }
}
