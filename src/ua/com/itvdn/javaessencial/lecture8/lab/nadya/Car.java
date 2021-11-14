package ua.com.itvdn.javaessencial.lecture8.lab.nadya;

//Определить конструкторы и методы setТип(), getТип(), toString(). В классе Car переопределить методы equals и hashCode.
//Создать массив объектов.
//
//Приложение при старте, выводит в консоли текстовое меню для выполнения
//пользователем нижеперечисленных операций.
//Вывести:
//a) список марок автомобилей из созданного массива объектов;
//b) список автомобилей, которые эксплуатируются больше n лет;
//c) список автомобилей заданного года выпуска, цена которых больше указанной.
//d) количество одинаковых автомобилей сравнивая с первым автомобилем (который помещен в массив) и саму характеристику автомобиля (используя toString())
//
//Постройте структуру меню приложения таким образом, чтобы пользователь
//мог последовательно вводить параметры поиска и получать результат. После
//выполнения выбранной операции, на экран должен выводиться результат и
//снова пользователю предлагается выполнить одну из операций до тех пор,
//пока пользователь выполнить выход из приложения.

import java.util.Objects;

public class Car {

    private int id;
    private String mark;
    private String model;
    private int yearProduction;
    private Color color;
    private int price;
    private int registerNumber;

    public Car(int id, String mark, String model, int yearProduction, String color, int price, int registerNumber) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.yearProduction = yearProduction;
        this.color = Color.valueOf(color.toUpperCase().replaceAll("[^A-za-z]+",""));
        this.price = price;
        this.registerNumber = registerNumber;
    }

    public int getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id = " + id +
                ", mark = '" + mark + '\'' +
                ", model = '" + model + '\'' +
                ", yearProduction = " + yearProduction +
                ", color = " + color +
                ", price = " + price +
                ", registerNumber = " + registerNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && yearProduction == car.yearProduction && price == car.price
                && registerNumber == car.registerNumber && Objects.equals(mark, car.mark)
                && Objects.equals(model, car.model) && color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mark, model, yearProduction, color, price, registerNumber);
    }
}
