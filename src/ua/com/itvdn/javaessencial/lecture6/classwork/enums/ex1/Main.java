package ua.com.itvdn.javaessencial.lecture6.classwork.enums.ex1;

public class Main {
    public static void main(String[] args) {

        // Об'єкт з посиланням на екземпляр перераховуючого типу Days
        Week saturday = Week.SATURDAY;
        System.out.println("Today is: " + saturday);

        // не можемо присвоювати інші значення
        // saturday = 1;

        // Чому не можно створити новий об'єкт enum.
        //  Day day = new Day();

        System.out.println(
                "name = " + saturday.name() + "\n" +
                        "index = " + saturday.ordinal() + "\n" +
                        "valueOf = " + Week.valueOf("TUESDAY") + "\n" +
                        "value = " + Week.values()[0]
        );
    }
}
