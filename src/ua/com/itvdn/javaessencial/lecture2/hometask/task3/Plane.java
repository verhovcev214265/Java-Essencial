package ua.com.itvdn.javaessencial.lecture2.hometask.task3;

public class Plane extends Vehicle{

    private final int weight; // m
    private final int numbersOfPassengers;

    public Plane(double coordinates, int price, int speed, int yearProduction, int weight, int numbersOfPassengers) {
        super(coordinates, price, speed, yearProduction);
        this.weight = weight;
        this.numbersOfPassengers = numbersOfPassengers;
    }

    @Override
    public String toString() {
        return BLUE_TEXT +"Plane{" +

                "coordinates = " + coordinates +
                ", price = " + price +
                ", speed = " + speed +
                ", yearProduction = " + yearProduction +
                ", weight = " + weight +
                ", numbersOfPassengers = " + numbersOfPassengers +
                '}';
    }
}
