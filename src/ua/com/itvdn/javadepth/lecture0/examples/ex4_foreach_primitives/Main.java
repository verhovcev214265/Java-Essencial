package ua.com.itvdn.javadepth.lecture0.examples.ex4_foreach_primitives;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 6, 8, 9, 3};

        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) System.out.print(numbers[i] + ", ");
            else System.out.print(numbers[i] + ".\n");
        }

        for(int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println("\n----------------------------------------------------------------------------------------");

        // Зміна значення поля класу
        for (int number : numbers){
            ++number;
            System.out.print(number + " ");
        }
        System.out.println("\n----------------------------------------------------------------------------------------");

        for (int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println("\n----------------------------------------------------------------------------------------");
    }
}
