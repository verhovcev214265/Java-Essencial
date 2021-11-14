package tests.superclass.object.tostring;

import java.util.Objects;

public class Car {

    private int yearProduction;
    private String model;
    private int speed;
    private static boolean isReadyToDrive = true;

    Car(int yearProduction, String model, int speed){
        this.yearProduction = yearProduction;
        this.model = model;
        this.speed = speed;
    }

    public static boolean getIsReagyToDrive(){
        return isReadyToDrive;
    }

    @Override
    public boolean equals (Object obj){
        if (this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        Car car = (Car) obj;
        if (yearProduction != ((Car) obj).yearProduction)
            return false;
        if (model != ((Car) obj).model)
            return false;
        if (speed != ((Car) obj).speed)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearProduction, model, speed);
    }

    @Override
    public String toString(){
        return String.format("Year production is: %d. \nModel is: %s. \nSpeed is: %d.",
                             yearProduction,model,speed);
    }
}
