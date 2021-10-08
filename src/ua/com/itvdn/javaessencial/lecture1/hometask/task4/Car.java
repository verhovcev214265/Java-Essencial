package ua.com.itvdn.javaessencial.lecture1.hometask.task4;

//(Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
//Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
//Перегрузить конструкторы вызывая конструктор из конструктора.
//Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.

public class Car {

    private int yearProduction;
    private double speed;
    private int weight; // kg
    Color color;

    Car(){

    }

    public Car(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public Car(int yearProduction, double speed) {
        this(yearProduction);
        this.speed = speed;
    }

    public Car(int yearProduction, double speed, int weight){
        this(yearProduction, speed);
        this.weight = weight;
    }

    public Car(int yearProduction, double speed, int weight,Color color){
        this(yearProduction, speed, weight);
        this.color = color;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }
}
