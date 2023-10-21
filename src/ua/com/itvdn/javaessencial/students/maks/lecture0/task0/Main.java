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

        int resultIndex = example.getIndex();
        String resultCountry = example.getCountry();
        String resultCity = example.getCountry();
        String resultStreet = example.getStreet();
        int resultHouse = example.getHouse();
        int resultApartment = example.getApartment();

        System.out.println(resultIndex + '\n' + resultCountry + '\n' + resultCity + '\n' + resultStreet
                + '\n' + resultHouse + '\n' + resultApartment);
    }
}
