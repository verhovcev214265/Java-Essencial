package ua.com.itvdn.javaessencial.lecture2.hometasks.task1;

public class Samsung extends Printer{

    public static final String BLACK_TEXT = "\u001B[30m";

    public Samsung(String model) {
        super(model);
    }

    @Override
    void print(String value) {
        System.out.println( BLACK_TEXT + "text: " + value);
    }

}
