package ua.com.itvdn.javaessencial.lecture6.lab.task1;
////строку с цветом автомобиля, и содержать перегруженный метод toString(), который должен возвращать
////строку с названием экземпляра, цветом и стоимостью автомобиля.
public class Main {
    public static void main(String[] args) {

        Vehicles audi = Vehicles.AUDI;
        System.out.println(audi.toString());

        System.out.println("---------------------------------------------------------------------------------");

        Vehicles bmw = Vehicles.BMW;
        System.out.println(bmw.getColor());

        System.out.println("---------------------------------------------------------------------------------");

        Vehicles honda = Vehicles.HONDA;
        System.out.println(honda);

    }
}
