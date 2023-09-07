package ua.com.itvdn.javaessencial.lecture8_object.classwork.ex4_equals_rules;

public class Main {
    public static void main(String[] args) {

        Example x = new Example(88);
        Example y = new Example(88);
        Example z = new Example(88);

        /*
        1) РЕФЛЕКСИВНІСТЬ
           Для будь-якого завданого значення x (x != null), вираз x.equals(x) має повертати true.
         */
        System.out.println(x.equals(x));

        /*
        2) СИМЕТРИЧНІСТЬ
           Для будь-яких завданих значень х та у x.equals(y) має повертати true, лише в тому випадку коли
           y.equals(x) теж буде повертати true.
         */
        System.out.println(x.equals(y) + "\n" + y.equals(x));

        /*
        3) ТРАНЗИТИВНІСТЬ
        Для будь-яких завданих значень х, у та z якщо x.equals(y) має повертати true та y.equals(z) повертає
        true тоді і x.equals(z) теж має повертати true.
         */
        System.out.println(
                x.equals(y) + "\n" +
                        y.equals(z) + "\n" +
                        x.equals(z)
        );

        /*
        4) УЗГОДЖЕНІСТЬ
        При багаторазовому виклику має повертатись одне і теж саме значення, якщо об'єкти не змінювались.
         */
        System.out.println(x.equals(y));

        /*
        5) ПОРІВНЯННЯ З null
        Для будь-якого завданого значення x, виклик x.equals(null) має повертати false.
         */
        System.out.println(x.equals(null));
    }
}
