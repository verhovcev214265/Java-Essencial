package ua.com.itvdn.javaessencial.lecture2.lab.task1;

//Создать базовый класс «Домашнее животное» и производные классы «Собака», «Кошка», «Попугай», «Хомяк».
//С помощью конструктора установить имя каждого животного и его характеристики.
//Реализуйте для каждого из классов функции:
//Sound – издает звук животного (пишем текстом в консоль);
//Show – отображает имя животного;
//Type – отображает название его подвида

public class Animal {
    private String name;
    private String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    void sound(){
    }

    void show(){
        System.out.println("My name is: " + name + "." + "\nInterface`m a: " + type + ".");
    }
}
