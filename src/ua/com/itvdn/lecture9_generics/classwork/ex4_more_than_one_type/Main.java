package ua.com.itvdn.lecture9_generics.classwork.ex4_more_than_one_type;

public class Main {
    public static void main(String[] args) {

        GenericTypes<Integer, Integer> integers = new GenericTypes<>(40, 50);
        GenericTypes<String, Double> strDouble = new GenericTypes<>("Oleksandr", 03.05);
        GenericTypes<Character, Boolean> charBool = new GenericTypes<>('A', true);

        System.out.println(
                "integers: " + integers.getElementA() + ", " + integers.getElementB() + "\n" +
                        "strDouble: " + strDouble.getElementA() + ", " + strDouble.getElementB() + "\n" +
                        "charBool: " + charBool.getElementA() + ", " + charBool.getElementB()
        );
    }
}
