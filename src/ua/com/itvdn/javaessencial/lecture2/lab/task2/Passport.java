package ua.com.itvdn.javaessencial.lecture2.lab.task2;

//Создайте класс Passport (паспорт), который будет содержать паспортную информацию о гражданине Украины.
//С помощью механизма наследования, реализуйте класс ForeignPassport (загран.паспорт) производный от Passport.
//Напомним, что заграничный паспорт содержит помимо паспортных данных, также данные о визах, номер заграничного паспорта.

public class Passport {

    private String firstName;
    private String lastName;
    private int age;

    public Passport(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", age = " + age +
                '}';
    }
}
