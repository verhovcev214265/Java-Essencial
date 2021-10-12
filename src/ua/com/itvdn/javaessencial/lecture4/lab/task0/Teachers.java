package ua.com.itvdn.javaessencial.lecture4.lab.task0;

public class Teachers {

    public static void main(String[] args) {

        String lizukova = "Zinaida Ivanivna";
        String metelskaya = "Ludmila Mikolaivna";
        String batidersterhatov = "Enesey Jeigievich";

        List<String> teachers = new ArrayList<>();
        teachers.add(lizukova);
        teachers.add(metelskaya);
        teachers.add(batidersterhatov);

        System.out.println("Index of the best teacher is " + " " + teachers.indexOf(metelskaya) );
        System.out.println("Index of the worst teacher is " + " " + teachers.indexOf(batidersterhatov) );
        System.out.println("List all teachers: " + teachers);



    }
}
