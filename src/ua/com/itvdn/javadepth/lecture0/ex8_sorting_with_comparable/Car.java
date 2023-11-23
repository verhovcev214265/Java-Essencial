package ua.com.itvdn.javadepth.lecture0.ex8_sorting_with_comparable;

public class Car implements Comparable<Car>{
    int speed;
    int price;
    String model;
    String color;

    public Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString(){
        return "Car: " +
                "model - " + this.model + ", color - " + this.color + ", speed = " + this.speed + ", price = " + this.price;
    }

    // Сотуємо по швидкості та ціні
//    @Override
//    public int compareTo(Car other) {
//        int temp = this.speed - ((other).speed;
//        if (temp == 0) return this.price - (other).price;
//        else return temp;
//    }

//     Порівняння по рядках
//    @Override
//    public int compareTo(Car other){
//        return this.model.compareTo((other).model);
//    }

    @Override
    public int compareTo(Car other){
        if (this.speed > other.speed) return 1;
        else if (this.speed == other.speed) return 0;
        else return -1;
    }

//    @Override
//    public int compareTo(Car other){
//        return Integer.compare(this.speed, other.speed);
//    }
}
