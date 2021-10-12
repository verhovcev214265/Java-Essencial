package ua.com.itvdn.javaessencial.lecture4.lab;

//Пользователь вводит с клавиатуры набор чисел. Полученные числа необходимо сохранить в список. После
//чего нужно показать меню, в котором предложить пользователю набор пунктов:
//1. Добавить элемент в список;
//2. Удалить элемент из списка;
//3. Показать содержимое списка;
//4. Проверить есть ли значение в списке;
//5. Заменить значение в списке.
//В зависимости от выбора пользователя выполняется
//действие, после чего меню отображается снова.

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersUser {
    public static void main(String[] args) {

        System.out.println("Enter numbers: ");
        Scanner scan = new Scanner(System.in);
        Integer input = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();
    }
}
