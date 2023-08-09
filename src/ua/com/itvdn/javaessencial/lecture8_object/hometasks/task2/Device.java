package ua.com.itvdn.javaessencial.lecture8_object.hometasks.task2;

import java.util.Objects;

public class Device {

    protected String manufacturer;
    protected float price;
    protected String serialNumber;

    public Device (String manufacturer, float price, String serialNumber){
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Device device = (Device) obj;
        if (manufacturer != device.manufacturer) return false;
        if (price != device.price) return false;
        if (serialNumber != device.serialNumber)return false;
        return true;
    }

    @Override
    public int hashCode(){
        return Objects.hash(manufacturer,price,serialNumber);
    }

    @Override
    public String toString(){
        return "Device: " + manufacturer + "; " +
                "price = " + price + "; " +
                "serialNumber = " + serialNumber + ";";
    }



}
