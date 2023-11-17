package ua.com.itvdn.javadepth.lecture0.examples.ex3_iterator_objects;

public class Car {
    int price;

    Car(int price){
        this.price = price;
    }

    @Override
    public String toString(){
        return "Car: price = " + this.price;
    }
}
