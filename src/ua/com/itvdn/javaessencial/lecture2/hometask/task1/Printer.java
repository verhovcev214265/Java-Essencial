package ua.com.itvdn.javaessencial.lecture2.hometask.task1;

//Создайте класс Printer.
//В теле класса создайте метод void print(String value), который выводит на экран значение аргумента.
//Реализуйте возможность того, чтобы в случае наследования от данного класса других классов, и вызове
//соответствующего метода их экземпляра, строки, переданные в качестве аргументов методов,
//выводились разными цветами.
//Обязательно используйте приведение типов.

public class Printer {

    private String model;

    void print(String value){
        System.out.println("Text: " + value);
    }

    public Printer(String model) {
        this.model = model;
    }

}
