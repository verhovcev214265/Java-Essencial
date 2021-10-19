package ua.com.itvdn.javaessencial.lecture6.lab.task1;

//Создайте перечислительный тип (enum) Vehicles, содержащий конструктор, который должен принимать
//целочисленное значение (стоимость автомобиля), содержать метод getColor(), который возвращает
//строку с цветом автомобиля, и содержать перегруженный метод toString(), который должен возвращать
//строку с названием экземпляра, цветом и стоимостью автомобиля.

public enum Vehicles {

    BMW(10000,"Black"), AUDI(20000, "Red"), HONDA(30000,"Blue");

    private int price;
    private String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return  "model is: " + this.name() +
                " price = " + price +
                ", color = '" + color + '\'' +
                '}';
    }
}
