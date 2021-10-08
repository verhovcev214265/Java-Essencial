package ua.com.itvdn.javaessencial.lecture2.hometask.task3;

// Создать класс Vehicle.
//В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год
//выпуска).
//Создайте 3 производных класса Plane, Саг и Ship.
//Для класса Plane должна быть определена высота и количество пассажиров.
//Для класса Ship – количество пассажиров и порт приписки.
//Написать программу, которая выводит на экран информацию о каждом средстве передвижения.

public class Vehicle {

    public static final String BLUE_TEXT = "\u001B[34m";

     double coordinates;
     int price;  // USD
     int speed;  // km.h
     int yearProduction;

    public Vehicle(double coordinates, int price, int speed, int yearProduction) {
        this.coordinates = coordinates;
        this.price = price;
        this.speed = speed;
        this.yearProduction = yearProduction;
    }

    @Override
    public String toString() {
        return BLUE_TEXT + "Vehicle{" +
                "coordinates = " + coordinates +
                ", price = " + price +
                ", speed = " + speed +
                ", yearProduction = " + yearProduction +
                '}';
    }
}
