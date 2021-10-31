package ua.com.itvdn.javaessencial.lecture8.lab;

////Приложение при старте, выводит в консоли текстовое меню для выполнения
////пользователем нижеперечисленных операций.
////Вывести:
////
////Постройте структуру меню приложения таким образом, чтобы пользователь
////мог последовательно вводить параметры поиска и получать результат. После
////выполнения выбранной операции, на экран должен выводиться результат и
////снова пользователю предлагается выполнить одну из операций до тех пор,
////пока пользователь выполнить выход из приложения.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[3];
        cars[0] = new Car(111,"BMW","X5",2012,"bla//1c6K",10000,0707);
        cars[1] = new Car(222,"Opel","Vectra",2007,"gr55ee?n",3000,7527);
        cars[2] = new Car(333,"Renault","Laguna",2003,"White",4500,1221);

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < cars.length; i++) {
            System.out.println("a) список марок автомобилей из созданного массива объектов;\n" +
                    "b) список автомобилей, которые эксплуатируются больше n лет;\n" +
                    "c) список автомобилей заданного года выпуска, цена которых больше указанной.\n" +
                    "d) количество одинаковых автомобилей сравнивая с первым автомобилем (который помещен в массив)" +
                    " и саму характеристику автомобиля (используя toString())\n");

            int input = scan.nextInt();

            switch (input){
                case 1 ->{
                    for (int j = 0; j < cars.length; j++) {
                        System.out.println(cars[j].getMark());

                    }
                }
                case 2 ->{
                    System.out.println("Enter year production of car: ");
                    int inputYearProd = scan.nextInt();

                }
                case 3 ->{

                }
                case 4 ->{
                    if (cars[0].equals(cars[1]) && cars[0].equals(cars[1])){
                        System.out.println();
                    }
                }
            }

        }
    }
}
