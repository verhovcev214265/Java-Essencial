package ua.com.itvdn.javaessencial.lecture7.hometasks.task2;

//Создайте проект, используя IntelliJ IDEA.
//Требуется: Описать класс с именем Price, содержащую следующие поля:
// название товара;
// название магазина, в котором продается товар;
// стоимость товара в гривнах.
////Написать программу, выполняющую следующие действия:
//// ввод с клавиатуры данных в массив, состоящий из двух элементов типа Price (записи должны
////быть упорядочены в алфавитном порядке по названиям магазинов);
//// вывод на экран информации о товарах, продающихся в магазине, название которого введено с
////лавиатуры (если такого магазина нет, вывести исключение).

import java.util.Arrays;
import java.util.Scanner;

public class Price implements Comparable{

    private String productName;
    private String shopName;
    private int price;

    public Price(String productName, String shopName, int price) {
        this.productName = productName;
        this.shopName = shopName;
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        return this.productName.compareTo(((Price)o).productName);
    }

    public static void creatStores(){
        System.out.println("Input numbers of stores");
        Scanner sc = new Scanner(System.in);
        int numbersOfStores = sc.nextInt();

        Price[] prices = new Price[numbersOfStores];

        for (int i = 0; i < prices.length; i++) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Write name of product: ");
            String nameOfProduct = scan.nextLine();

            System.out.println("Write name of store: ");
            String nameOfStore = scan.nextLine();

            System.out.println("Write price: ");
            int priceOfProduct = scan.nextInt();

            System.out.println();
            prices[i] = new Price(nameOfProduct, nameOfStore, priceOfProduct);
        }

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Input store name: ");
            String storeName = scanner.nextLine();
            for (int i = 0; i < prices.length; i++) {
                if (storeName.equals(prices[i].shopName)){
                    System.out.println("Product: " + prices[i].productName + " has such price: " + prices[i].price);
                }
            }

        }catch (Exception e){
            System.out.println("There is no such store, sorry.");
        }

        Arrays.sort(prices);
        for(Price temp: prices){
            System.out.println(temp);
        }
    }

    @Override
    public String toString() {
        return "Price{" +
                "productName = '" + productName + '\'' +
                ", shopName = '" + shopName + '\'' +
                ", price = " + price +
                '}';
    }


}
