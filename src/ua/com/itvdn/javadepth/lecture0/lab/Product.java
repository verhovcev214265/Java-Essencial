package ua.com.itvdn.javadepth.lecture0.lab;

import java.util.Comparator;

public class Product  {

    private String name;
    private int price;
    private int numbers;

    public Product(String name, int price, int numbers) {
        this.name = name;
        this.price = price;
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name = '" + name + '\'' +
                ", price = " + price +
                ", numbers = " + numbers +
                '}';
    }

}
