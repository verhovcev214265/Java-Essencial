package ua.com.itvdn.javaessencial.lecture2.lab.task1;

public class Main {
    public static void main(String[] args) {

        Animal rex = new Dog("Rex","Dog");
        rex.show();
        rex.sound();

        System.out.println("-----------------------------------------");

        Animal naphanya = new Cat("Naphanya", "Cat");
        naphanya.show();
        naphanya.sound();

        System.out.println("-----------------------------------------");

        Animal kesha = new Parrot("Kesha","Parrot");
        kesha.show();
        kesha.sound();

        System.out.println("-----------------------------------------");

        Animal homa = new Hamster("Homa","Hamster");
        homa.show();
        homa.sound();
    }
}
