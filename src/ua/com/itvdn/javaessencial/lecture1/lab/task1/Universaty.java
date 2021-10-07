package ua.com.itvdn.javaessencial.lecture1.lab.task1;

public class Universaty {
    public static void main(String[] args) {

        Student olexandr = new Student("Olexandr","Verhovcev",1992,9379992, +
                10,Student.count);

        System.out.println();
        System.out.println(olexandr);

        System.out.println("-------------------------------------------------------------------------------------------------");

        Student mark = new Student("Marcus","Aurelius",121, +Student.count);
        System.out.println(mark);

        System.out.println("-------------------------------------------------------------------------------------------------");


        Student borodatiy = new Student();
        borodatiy.setFirstName("Sashka");
        borodatiy.setLastName("Historic");
        borodatiy.setYearBorn(1991);
        borodatiy.setPhoneNumber(380679386573L);
        borodatiy.setGroup(10);


        System.out.println(borodatiy.getFirstName() + ", " + borodatiy.getLastName() + ", " + borodatiy.getYearBorn() +
                           ", " + borodatiy.getPhoneNumber() + ", " + borodatiy.getGroup() + ", " + Student.count + ".");

    }
}
