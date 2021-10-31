package ua.com.itvdn.javadepth.lecture0.lab;

////Создайте класс Product с полями: Имя продукта, цена, количество. Создайте 2
////отдельных класса, реализующих интерфейс Comparator, а именно метод
////compare() для сортировки объектов по названию и по цене. Затем создайте несколько
////коллекций продуктов (массив и ArrayList) и вызовите метод Arrays.sort() или Collections.sort() соответственно,
////который выполняет сортировку и принимает в качестве параметров массив/список продуктов и объект
////класса реализующий интерфейс Comparator. Выведите список продуктов (ArrayList) через итератор

public class Main {
    public static void main(String[] args) {

        Product toyota = new Product("Prius", 18000, 100);
        Product honda = new Product("Civic", 9000, 101);


    }
}
