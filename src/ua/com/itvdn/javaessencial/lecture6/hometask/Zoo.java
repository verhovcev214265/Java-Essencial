package ua.com.itvdn.javaessencial.lecture6.hometask;

public class Zoo {
    public static void main(String[] args) {

        Animals[] animals = Animals.values();

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
    }
}
