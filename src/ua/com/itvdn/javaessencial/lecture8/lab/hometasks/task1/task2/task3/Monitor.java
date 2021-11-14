package ua.com.itvdn.javaessencial.lecture8.lab.hometasks.task1.task2.task3;

import java.util.Objects;

public class Monitor extends Device {

    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY =resolutionY;
    }

    static class EthernetAdapter{
        private int speed;
        private String mac;

        public EthernetAdapter(int speed, String mac){
            this.speed = speed;
            this.mac = mac;
        }
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Monitor monitor = (Monitor) obj;
        if (manufacturer != monitor.manufacturer && price != monitor.price && serialNumber != monitor.serialNumber
            && resolutionX != monitor.resolutionX && resolutionY != monitor.resolutionY ){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(manufacturer,price,serialNumber,resolutionX,resolutionY);
    }

    @Override
    public String toString() {
        return "Monitor: " +
                "manufacturer = " + manufacturer + "; " +
                "price = " + price + "; " +
                "serial number = " + serialNumber + "; " +
                "resolutionX = " + resolutionX + "; " +
                "resolutionY = " + resolutionY +
                '}';
    }
}
