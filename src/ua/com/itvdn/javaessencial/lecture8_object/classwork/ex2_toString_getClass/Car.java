package ua.com.itvdn.javaessencial.lecture8_object.classwork.ex2_toString_getClass;

public class Car {

    private String color;
    private int speed;

    public Car() {
    }

    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

//    @Override
//    public String toString(){
//        return super.toString();
//    }

//    @Override
//    public String toString() {
//        return
//                "Car: color is " + color
//                        + " speed = " + speed + ".";
//    }

    @Override
    public String toString(){
        return String.format("Color is: %s.\nSpeed = %s.", color, speed);
    }

}
