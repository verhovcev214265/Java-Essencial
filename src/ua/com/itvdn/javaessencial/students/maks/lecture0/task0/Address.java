package ua.com.itvdn.javaessencial.students.maks.lecture0.task0;

/*
Требуется: Создать класс с именем Address. В теле класса требуется создать поля: index, country, city,
street, house, apartment.
Для каждого поля, создать метод с двумя методами доступа (get, set)
Создать экземпляр класса Address.
В поля экземпляра записать информацию о почтовом адресе.
Выведите на экран значения полей, описывающих адрес.
 */

public class Address {

    private int index;
    private String country;
    private String city;
    private String street;
    private int house;
    private int apartment;

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getHouse() {
        return house;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public int getApartment() {
        return apartment;
    }
}
