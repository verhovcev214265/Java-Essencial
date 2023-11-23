package ua.com.itvdn.javadepth.lecture0.ex5_foreach_objects;

public class Main {
    public static void main(String[] args) {

        Car carA = new Car("BMW", 5000);
        Car carB = new Car("Mercedes", 4000);
        Car carC = new Car("Mazda", 3000);

        Car[] cars = {carA, carB, carC};

        for (Car car : cars){
            car.price = car.price + 500;
            car.model = "Audi";
//            car = new Car("Opel", 200);
        }

        // Чи змінеться об'єкт?
//        cars[0] = new Car("Opel", 200);

        for (Car car : cars){
            System.out.println(car);
        }


    }
}
