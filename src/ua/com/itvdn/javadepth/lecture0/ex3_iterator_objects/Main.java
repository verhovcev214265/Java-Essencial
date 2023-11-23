package ua.com.itvdn.javadepth.lecture0.ex3_iterator_objects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(3000));
        cars.add(new Car(3500));
        cars.add(new Car(4000));
        cars.add(new Car(4500));
        cars.add(new Car(5000));

        Iterator<Car> carIterator = cars.iterator();
        while (carIterator.hasNext()) {
            Car temp = carIterator.next();
            temp.price++;
        }
        System.out.print(
                cars +
                        "\n--------------------------------------------------------------------------------------------------\n"
        );

        ListIterator<Car> carListIterator = cars.listIterator();
        System.out.println("Next:");
        while (carListIterator.hasNext()){
            Car temp = carListIterator.next();
            System.out.println(temp);
        }

        System.out.println("Previous:");
        while (carListIterator.hasPrevious()){
            Car temp = carListIterator.previous();
            System.out.println(temp);
        }

    }
}
