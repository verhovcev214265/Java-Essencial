package ua.com.itvdn.javaessencial.lecture3.classwork.abstractclasses.ex6_Array_Objects;

public class BMW extends Car{

    public BMW(String model, int speed) {
        super(model, speed);
    }

    @Override
    String engine() {
        return "V12";
    }
}
