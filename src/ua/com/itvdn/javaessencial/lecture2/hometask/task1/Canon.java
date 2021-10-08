package ua.com.itvdn.javaessencial.lecture2.hometask.task1;

public class Canon extends Printer {

    public static final String BLUE_TEXT = "\u001B[34m";

    public Canon(String model) {
        super(model);
    }

    @Override
    void print(String value) {
        System.out.println(BLUE_TEXT + "text: " + value );
    }

}
