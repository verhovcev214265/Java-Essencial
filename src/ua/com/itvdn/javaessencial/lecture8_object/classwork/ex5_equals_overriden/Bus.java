package ua.com.itvdn.javaessencial.lecture8_object.classwork.ex5_equals_overriden;

public class Bus {

    private int speed;

    public Bus(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object other){
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Bus bus = (Bus) other;
        if (speed != bus.speed) return false;
        return true;
    }
}
