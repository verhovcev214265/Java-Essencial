package ua.com.itvdn.javaessencial.lecture3.lab.task1;
import java.util.Scanner;
//Для проверки определите массив
//ссылок на абстрактный класс, которым присваиваются адреса различных объектов классов-потомков.
public class Main {

    public static final String YELLOW_TEXT = "\u001B[33m";

    public static void main(String[] args) {

        Figure[] figures = new Figure[4];

        Scanner scan = new Scanner(System.in);
        System.out.println(YELLOW_TEXT + "If you want calculate area of Rectangle enter 1.\nCircle enter 2.\n" +
                "Right Triangle enter 3.\nTrapeze enter 4.\nIf you want to go out enter 0");

        int input = scan.nextInt();

        switch (input){
            case 0:
                System.out.println("Bye - Bye");
                break;
            case 1:
                System.out.println("Enter weight and width of rectangle: ");

                double weight = scan.nextDouble();
                double width = scan.nextDouble();

                figures[0] = new Rectangle(weight, width);
                System.out.println("Area of Rectangle = " + figures[0].myArea());
                System.out.println(figures[0]);
                System.out.println("----------------------------------------------------------------------------------");
                break;
            case 2:
                System.out.println("Enter radius of circle: ");
                double PI = 3.14;
                double radius = scan.nextDouble();

                figures[1] = new Circle(PI,radius);
                System.out.println("Area of Circle = " + figures[1].myArea());
                System.out.println(figures[1]);
                System.out.println("-----------------------------------------------------------------------------------");
                break;
            case 3:
                System.out.println("Enter weight and with of right triangle: ");
                double weightT = scan.nextDouble();
                double widthT = scan.nextDouble();

                figures[2] = new RightTriangle(weightT, widthT);
                System.out.println("Area of RightTriangle = " + figures[2].myArea());
                System.out.println(figures[2]);
                System.out.println("-----------------------------------------------------------------------------------");
                break;
            case 4:
                System.out.println("Enter basis1, basis2 and weight for trapeze: ");
                double basis1 = scan.nextDouble();
                double basis2 = scan.nextDouble();
                double weightTR = scan.nextDouble();

                figures[3] = new Trapeze(basis1,basis2,weightTR);
                System.out.println("Area of Trapeze = " + figures[3].myArea());
                System.out.println(figures[3]);
                break;
            default:
                System.out.println("You enter incorrect symbol, please enter 1,2,3,4 or 0 for Exit!");
        }
    }
}
