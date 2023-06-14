package ua.com.itvdn.javaessencial.lecture3.classwork.abstractclasses.ex6_Array_Objects;

public class Opel extends Car{

    public Opel(String model, int speed){
        super(model, speed);
    }

    @Override
    public String engine(){
        return "V8";
    }
}
