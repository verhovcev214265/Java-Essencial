package ua.com.itvdn.javaessencial.lecture2.hometask.task2;
//Создайте класс ученик Pupil. В теле класса создайте методы void study(), void read(), void write(), void relax().
//Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil и
//переопределите каждый из методов, в зависимости от успеваемости ученика.
//Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
//Предусмотрите возможность того, что пользователь может передать 2 или 3 аргумента.
//Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать,
//отдыхать.
import java.util.Scanner;

public class ClassRoom {
    public static void main(String[] args) {
        
        for (int i = 0; i < 4; i++) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter pupil name: ");
            String inputName = scan.nextLine();

            System.out.println("Enter student's average score from 1 to 5 : ");
            int inputRating = scan.nextInt();

            try {
                if (inputRating > 0 && inputRating <= 5) {

                    switch (inputRating) {
                        case (5) -> {
                            Pupil excellent = new ExcellentPupil(inputName);
                            System.out.println(excellent);
                            excellent.study(inputRating);
                            excellent.read(inputRating);
                            excellent.write(inputRating);
                            excellent.relax(inputRating);
                        }
                        case (4) -> {
                            Pupil good = new GoodPupil(inputName);
                            System.out.println(good);
                            good.study(inputRating);
                            good.read(inputRating);
                            good.write(inputRating);
                            good.relax(inputRating);
                        }
                        case (3) -> {
                            Pupil bad = new BadPupil(inputName);
                            System.out.println(bad);
                            bad.study(inputRating);
                            bad.read(inputRating);
                            bad.write(inputRating);
                            bad.relax(inputRating);
                        }
                        default -> System.out.println("Very bad pupil, because rating less than 3");
                    }
                } else {
                    throw new ArithmeticException();
                }
            } catch (ArithmeticException e) {
                System.out.println("You enter incorrect symbol please enter from to 5 ONLY!");
            }
        }

    }
}

