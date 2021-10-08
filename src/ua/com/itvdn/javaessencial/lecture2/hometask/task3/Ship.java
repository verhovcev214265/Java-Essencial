package ua.com.itvdn.javaessencial.lecture2.hometask.task3;

public class Ship extends Vehicle{

    private final String port;
    private final int numbersOfPassengers;


    public Ship(double coordinates, int price, int speed, int yearProduction, String port, int numbersOfPassengers) {
        super(coordinates, price, speed, yearProduction);
        this.port = port;
        this.numbersOfPassengers = numbersOfPassengers;
    }

    @Override
    public String toString() {
        return BLUE_TEXT + "Ship{" +
                "coordinates = " + coordinates +
                ", price = " + price +
                ", speed = " + speed +
                ", yearProduction = " + yearProduction +
                ", port ='" + port + '\'' +
                ", numbersOfPassengers = " + numbersOfPassengers +
                '}';
    }
}
