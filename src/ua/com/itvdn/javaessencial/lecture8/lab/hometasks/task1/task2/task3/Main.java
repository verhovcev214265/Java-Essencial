package ua.com.itvdn.javaessencial.lecture8.lab.hometasks.task1.task2.task3;
//Создать классы:
//1) Основной класс Device (manufacturer(String), price(float), serialNumber(String));
//2) Сабкалсс Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter (speed (int), mac (String));
//Добавить методы доступа. Конструктор.
//Смотреть задание 2.
//В обоих классах переопределить метод toString, что бы вывод был следующим:
//Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
//Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024
//Смотреть задание 2.
//Переопределить методы equals & hashCode в каждом классе.
//Создать класс Main, в котором создать объекты классов и продемонстрировать переопределенные методы

public class Main {
    public static void main(String[] args) {

        Device device = new Device("Samsung", 120.0f, "AB1234567CD");
        Device monitor1 = new Monitor("Samsung", 120.0f, "AB1234567CD",1280, 1024);
        Device monitor2 = new Monitor("Samsung", 120.0f, "AB1234567CD",1280, 1024);

        System.out.println(device);
        System.out.println(monitor1);

        System.out.println("==========================================================================================");

        System.out.println("Is the device equals monitor1? : " + device.equals(monitor1));
        System.out.println("Is the monitor1 equals monitor2? : " + monitor1.equals(monitor2));

        System.out.println("==========================================================================================");

        System.out.println("Hash code from device = " + device.hashCode());
        System.out.println("Hash code from monitor1 = " + monitor1.hashCode());
        System.out.println("Hash code from monitor2 = " + monitor2.hashCode());

    }
}
