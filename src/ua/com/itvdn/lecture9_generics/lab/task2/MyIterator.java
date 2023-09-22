package ua.com.itvdn.lecture9_generics.lab.task2;
import java.util.Iterator;

// Завдання 2
// Написати свій ітератор по одномірному масиву
// Ітератором буде клас, який реалізовує інтерфейс Iterator<T>
// В цьому класі необхідно створити конструктор и реалізувати методи  boolean hasNext() і T next()
// В методі next() необхідно зробити перевірку на наступний елемент
// Якщо такого елементу немає потрібно викинути NoSuchElementException()

public class MyIterator <T> implements Iterator<T> {

    private int count;
    private final T[] arr;

    MyIterator(T[] arr){
        this.arr = arr;
    }



    @Override
    public boolean hasNext() {

            return false;

    }

    @Override
    public T next() {
        return null;
    }
}
