package ua.com.itvdn.javaessencial.lecture1.lab;

public class Universaty {
    public static void main(String[] args) {

        Student olexandr = new Student("Olexandr","Verhovcev",1992,9379992,10);
        System.out.println(olexandr);

        Student mark = new Student("Mark", "Avreley",35,102,10);
        System.out.println(mark);

        StudentGetSet ivan = new StudentGetSet();
        ivan.setFirstName("Ivan");
        ivan.setLastName("Ivanov");
        ivan.setYearBorn(1995);
        ivan.setPhoneNumber(9379992);
        ivan.setGroup(10);

        System.out.println(ivan.getFirstName() + ", " + ivan.getLastName() + ", " + ivan.getYearBorn() + ", " +
                + ivan.getPhoneNumber() + ", " + ivan.getGroup());
    }
}
