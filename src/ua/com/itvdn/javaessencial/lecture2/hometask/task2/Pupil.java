package ua.com.itvdn.javaessencial.lecture2.hometask.task2;

//Создайте класс ученик Pupil. В теле класса создайте методы void study(), void read(), void write(), void relax().
//Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil и
//переопределите каждый из методов, в зависимости от успеваемости ученика.
//Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
//Предусмотрите возможность того, что пользователь может передать 2 или 3 аргумента.
//Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать,
//отдыхать.

public class Pupil {

    private String name;

    public Pupil(String name) {
        this.name = name;
    }

    void study(int rating){
        System.out.println("Study is: ");
    }

    void read(int rating){
        System.out.println("Read is: ");
    }

    void write(int rating){
        System.out.println("Write is: ");
    }

    void relax(int rating){
        System.out.println("Relax is: ");
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name = '" + name + '\'' +
                '}';
    }
}
