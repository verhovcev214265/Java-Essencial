package ua.com.itvdn.javadepth.lecture1.ex3_stack;

import java.util.EmptyStackException;

public class Stack {
    private int size;
    private final long[] array;
    private int top;

    public Stack(int size){
        this.size = size;
        this.array = new long[size];
        this.top = -1;
    }

    // Кладе елемент у верхню частину стеку
    public int push(int element){
        array[++top] = element;
        return element;
    }

    // Перевірка чи не пустий стек
    public boolean isEmpty(){
        return top == -1;
    }

    //повертає верхній елемент не видаляючи його.
    public long peek() throws EmptyStackException{
        if (top == -1) throw new EmptyStackException();
        return array[top];
    }

    //повертає верхній елемент не видаляючи його.
    public long pop() throws EmptyStackException{
        if (top == -1) throw new EmptyStackException();
        return array[--top];
    }

}
