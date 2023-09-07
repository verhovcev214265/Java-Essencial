package ua.com.itvdn.javaessencial.lecture8_object.classwork.ex8_equals_with_hashcode;

import java.util.Objects;

public class Bus {
    private String model;

    public Bus(){}

    public Bus(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object other){
        if (this == other) return true;
        if(!(other instanceof Bus)) return false;
        Bus bus = (Bus) other;
        return Objects.equals(model, bus.model);
    }

    @Override
    public int hashCode(){
        return Objects.hash(model);
    }
}
