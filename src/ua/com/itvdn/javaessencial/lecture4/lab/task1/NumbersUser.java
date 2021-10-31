package ua.com.itvdn.javaessencial.lecture4.lab.task1;
//Пользователь вводит с клавиатуры набор чисел. Полученные числа необходимо сохранить в список. После
//чего нужно показать меню, в котором предложить пользователю набор пунктов:
//1. Добавить элемент в список;
//2. Удалить элемент из списка;
//3. Показать содержимое списка;
//4. Проверить есть ли значение в списке;
//5. Заменить значение в списке.
//В зависимости от выбора пользователя выполняется
//действие, после чего меню отображается снова.
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersUser extends Colors {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.ensureCapacity(30);

        System.out.println("Enter the number of numeric items you want to enter: ");
        int elements = scan.nextInt();

        for (int i = 0; i < elements; i++) {
            System.out.println("Enter times numbers: ");
            int inputNumbers = scan.nextInt();
            numbers.add(inputNumbers);
        }
        System.out.println("Length of list = " + numbers.size());
        System.out.println(numbers);

        for (int i = 0; i >= 0; i++) {

            System.out.println(YELLOW_TEXT + "Enter: 1. if you want add an item to the list ;\n" +
                    "Enter 2. if you want Remove an item from the list;\n" +
                    "Enter 3. if you want Show the contents of the list;\n" +
                    "Enter 4. if you want Check if the value is in the list;\n" +
                    "Enter 5. if you want Replace the value in the list.");

            int input = scan.nextInt();
            try {
                if (input == 0) {
                    i = -2;
                    System.out.println("Bye - bye");
                }
                switch (input) {

                    case 1 -> {
                        System.out.println("Enter index: ");
                        int index = scan.nextInt();
                        if (index >= 0 && index <= numbers.size()) {
                            System.out.println("Enter element: ");
                            int element = scan.nextInt();

                            numbers.add(index, element);
                            System.out.println(BLUE_TEXT + numbers);
                            System.out.println(BLUE_TEXT + "Length of list = " + numbers.size());

                        } else {
                            throw new ArithmeticException();
                        }
                        System.out.println();
                    }
                    case 2 -> {
                        System.out.println("Enter number of index witch do you remove: ");
                        int remoteIndex = scan.nextInt();
                        if (remoteIndex >= 0 && remoteIndex <= numbers.size() - 1) {
                            numbers.remove(remoteIndex);
                            System.out.println(numbers);
                            System.out.println(BLUE_TEXT + "Length of list = " + numbers.size());
                        } else {
                            throw new ArithmeticException();
                        }
                        System.out.println();
                    }
                    case 3 -> {
                        System.out.println(GREEN_TEXT + numbers);
                        System.out.println(GREEN_TEXT + "Length of list = " + numbers.size());
                        System.out.println();
                    }
                    case 4 -> {
                        System.out.println("Enter number witch do you check: ");
                        int checkObj = scan.nextInt();
                        System.out.println(PURPLE_TEXT + numbers.contains(checkObj));
                        System.out.println(numbers);
                        System.out.println("Length of list = " + numbers.size());
                        System.out.println();
                    }
                    case 5 -> {
                        System.out.println("Enter index number witch do you change: ");
                        int indexChange = scan.nextInt();

                        if (indexChange >= 0 && indexChange <= numbers.size()) {
                            System.out.println("Enter the number you want to change to: ");
                            int changeElement = scan.nextInt();

                            numbers.set(indexChange, changeElement);
                            System.out.println(numbers);
                            System.out.println("Length of list = " + numbers.size());
                        } else {
                            throw new ArithmeticException();
                        }
                    }
                    default -> System.out.println(BLACK_TEXT +
                            "You enter incorrect number please enter number from 1 to 5 or you are exit");
                }

            } catch (ArithmeticException e) {
                System.out.println(RED_TEXT + "You enter incorrect number.\nThe number must start from 0 and don`t be more " +
                        "than list length!");
            }
        }
        scan.close();
    }
}
