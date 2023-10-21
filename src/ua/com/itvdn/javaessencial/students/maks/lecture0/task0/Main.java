package ua.com.itvdn.javaessencial.students.maks.lecture0.task0;

public class Main {
    public static void main(String[] args) {
        Address example = new Address();

        example.setIndex(5);
        example.setCountry("Ukraine");
        example.setCity("Kiev");
        example.setStreet("Harmatna");
        example.setHouse(30);
        example.setApartment(102);

        System.out.println(
                "Index = : " + example.getIndex() + "\n" + example.getCountry() + "\n" + example.getCity() + "\n"
                        + example.getStreet() + "\n" + example.getHouse() + "\n" + example.getApartment()
        );
    }
}
