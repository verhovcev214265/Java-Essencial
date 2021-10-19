package ua.com.itvdn.javaessencial.lecture5.hometasks.task2;

//Создать класс Distance с полем distance типа double и методом print. В классе Distance, создайте
//статический класс Converter с методами, которые будут конвертировать расстояние в разные единицы
//измерения (к примеру, из метров в километры, из километров в мили, и так далее).

public class Distance {
    public static final String BLUE_TEXT = "\u001B[34m";
    private static double distance;

    public static double getDistance() {
        return distance;
    }

    public static void print(double distance){
        System.out.println(BLUE_TEXT + "Your convert value = " + distance);
    }

    static class Converter{

        private static final double KILOMETER = 1000;
        private static final double MILES = 0.6214;
        private static final double FOOT = 3.28084;

        public static double metersToKilometers(double value){
            return distance = value / KILOMETER;
        }

        public static double kilometersToMiles(double value){
            return distance = value * MILES;
        }

        static double metersAndFeet(double value){
            return distance = value * FOOT;
        }

    }
}
