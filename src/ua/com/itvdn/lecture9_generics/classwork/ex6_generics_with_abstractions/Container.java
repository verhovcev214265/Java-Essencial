package ua.com.itvdn.lecture9_generics.classwork.ex6_generics_with_abstractions;

public class Container<T> implements IContainer<T> {
    private T figure;

    public Container(T figure){
       this.figure = figure;
    }

    @Override
    public T getFigure() {
        return figure;
    }

    @Override
    public void setFigure(T figure) {
        this.figure = figure;
    }
}
