package tests.superclass.object.finals;

public class Main {
    public static void main(String[] args) {

        Cat naphanya = new Cat("Naphanya");
        System.out.println(naphanya);

        final Cat knopa = naphanya;
        System.out.println(knopa);

        Cat begemot = new Cat("Begemot");
        Cat change = naphanya;

        System.out.println(knopa);

    }
}
