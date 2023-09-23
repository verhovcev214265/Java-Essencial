package ua.com.itvdn.lecture9_generics.classwork.ex6_generics_with_abstractions;

public class Main {
    public static void main(String[] args) {

        Circle circleA = new Circle("Circle A");
        Circle circleB = new Circle("Circle B");

        IContainer<Circle> iContainer = new Container<>(circleA);
        System.out.println(iContainer.getFigure());

        IContainer<Shape> shapeIContainer = new Container<>(circleB);
        System.out.println(shapeIContainer.getFigure());


    }
}
