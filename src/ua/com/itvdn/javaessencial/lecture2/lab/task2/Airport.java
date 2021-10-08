package ua.com.itvdn.javaessencial.lecture2.lab.task2;

public class Airport {
    public static void main(String[] args) {

        Passport olexandr = new Passport("Olexandr","Verhovcev", 31);
        System.out.println(olexandr);

        Passport olexandrForeign = new ForeignPassport("Olexandr","Verhovcev", 31,"USA",
           + 102103104);
        System.out.println(olexandr + " + " + olexandrForeign);

    }
}
