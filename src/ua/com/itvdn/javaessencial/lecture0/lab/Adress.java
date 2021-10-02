package ua.com.itvdn.javaessencial.lecture0.lab;

// Задание
//Используя IDEA, создайте проект c пакетом.
//Требуется: Создать класс с именем Address. В теле класса требуется создать поля: index, country, city,
//street, house, apartment.
//Для каждого поля, создать метод с двумя методами доступа (get, set)
//Создать экземпляр класса Address.
//В поля экземпляра записать информацию о почтовом адресе.
//Выведите на экран значения полей, описывающих адрес.

public class Adress {
    private int index;
    private String country;
    private String city;
    private String street;
    private int house;
    private int apartment;

    public Adress(int index, String country, String city, String street, int house, int apartment) {
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "index = " + index +
                ", country ='" + country + '\'' +
                ", city ='" + city + '\'' +
                ", street ='" + street + '\'' +
                ", house =" + house +
                ", apartment =" + apartment +
                '}';
    }
}
