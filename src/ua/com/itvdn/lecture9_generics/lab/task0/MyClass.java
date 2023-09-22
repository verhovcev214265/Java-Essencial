package ua.com.itvdn.lecture9_generics.lab.task0;

//Создайте класс MyClass<T>, содержащий статический фабричный метод - T factoryMethod(), который
//будет порождать экземпляры типа, указанного в качестве параметра типа (указателя места заполнения
//типом – Т).

public class MyClass <T> {

    public static <T> void factoryMethod(T myType){
        System.out.println(myType.toString());
    }

}
