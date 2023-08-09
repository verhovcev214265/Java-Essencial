package ua.com.itvdn.javaessencial.lecture8_object.nadya;
import java.util.Objects;
import java.time.Year;
import java.util.Scanner;
//Определить конструкторы и методы setТип(), getТип(), toString(). В классе Car переопределить методы equals и hashCode.
//Создать массив объектов.
//Приложение при старте, выводит в консоли текстовое меню для выполнения
//пользователем нижеперечисленных операций.
//Вывести:
//a) список марок автомобилей из созданного массива объектов;
//b) список автомобилей, которые эксплуатируются больше n лет;
//c) список автомобилей заданного года выпуска, цена которых больше указанной.
//d) количество одинаковых автомобилей сравнивая с первым автомобилем (который помещен в массив)
// и саму характеристику автомобиля (используя toString())
//Постройте структуру меню приложения таким образом, чтобы пользователь
//мог последовательно вводить параметры поиска и получать результат. После
//выполнения выбранной операции, на экран должен выводиться результат и
//снова пользователю предлагается выполнить одну из операций до тех пор,
//пока пользователь выполнить выход из приложения.

public class Car {

    private int id;
    private String mark;
    private String model;
    private int yearProduction;
    private Color color;
    private int price;
    private int registerNumber;

    Car(){}

    public Car(int id, String mark, String model, int yearProduction, String color, int price, int registerNumber) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.yearProduction = yearProduction;
        this.color = Color.valueOf(color.toUpperCase().replaceAll("[^A-za-z]+",""));
        this.price = price;
        this.registerNumber = registerNumber;
    }

    public void carsManipulation(){
        Car[] cars = new Car[5];

        cars[0] = new Car(111,"BMW","X5",2019,"bla//1c6K",10000, 455);
        cars[1] = new Car(112,"BMW","X5",2019,"bla//1c6K",10000, 456);
        cars[2] = new Car(113,"BMW","X6",2020,"bla//1c6K",30000, 457);
        cars[3] = new Car(222,"Opel","Vectra",2010,"gr55ee?n",3000,7527);
        cars[4] = new Car(333,"Renault","Laguna",2000,"White",4500,1221);

        Scanner scan = new Scanner(System.in);
        int exit = 1;

        while (exit == 1){
            System.out.println(
                    "0) If you want to go out input 0\n" +
                            "1) список марок автомобилей из созданного массива объектов;\n" +
                            "2) список автомобилей, которые эксплуатируются больше n лет;\n" +
                            "3) список автомобилей заданного года выпуска, цена которых больше указанной.\n" +
                            "4) количество одинаковых автомобилей сравнивая с первым автомобилем (который помещен в массив)" +
                            " и саму характеристику автомобиля (используя toString())\n" +
                            "5) cars comparison");
            int input = scan.nextInt();

            switch (input){
                case 0 ->{
                    System.out.println("Bye - Bye");
                    exit = 0;
                }
                case 1 ->{
                    for (int j = 0; j < cars.length; j++) {
                        System.out.println(cars[j].getMark());
                        System.out.println(cars[j] + "\n");
                    }
                }
                case 2 ->{
                    System.out.println("Enter year production of car: ");

                    int yearsOfOperation = scan.nextInt();
                    int yearNow = Year.now().getValue();
                    int carsOperatingTime = yearNow - yearsOfOperation;

                    for (int j = 0; j < cars.length; j++) {
                        if (carsOperatingTime > cars[j].getYearProduction()){
                            System.out.println(cars[j] + "\n");
                        }
                    }
                }
                case 3 ->{
                    System.out.println("Input year production: ");
                    int inputYearProduction = scan.nextInt();
                    System.out.println("Input price: ");
                    int inputPrice = scan.nextInt();
                    for (int j = 0; j < cars.length; j++) {
                        if (inputYearProduction == cars[j].getYearProduction() && inputPrice < cars[j].getPrice()){
                            System.out.println(cars[j] + "\n");
                        }
                    }
                }
                case 4 ->{
                    for (int j = 0; j < cars.length; j++){
                        if (cars[0].equals(cars[j]) && cars[0].hashCode() == cars[j].hashCode()){
                            int numbersEqualsCars = (j + 1);
                            System.out.println("Numbers of equals cars = " + numbersEqualsCars);
                            System.out.println(cars[j]);
                        }
                    }
                }
                case 5 ->{
                    for (int j = 0; j < (cars.length - 1); j++) {
                        System.out.println("Is car " + j + " equals car " + (j + 1) + "? It`s a: "
                                + cars[0].equals(cars[j + 1]) + "\n");
                    }
                }
            }

        }
        scan.close();
    }

    public String getMark() {
        return mark;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id = " + id +                                  // individual
                ", mark = '" + mark + '\'' +
                ", model = '" + model + '\'' +
                ", yearProduction = " + yearProduction +
                ", color = " + color +
                ", price = " + price +
                ", registerNumber = " + registerNumber +        // individual
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        if (mark != car.mark || model != car.model || yearProduction != car.yearProduction ||
            color != car.color || price != car.price){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mark, model, yearProduction, color, price, registerNumber);
    }
}
