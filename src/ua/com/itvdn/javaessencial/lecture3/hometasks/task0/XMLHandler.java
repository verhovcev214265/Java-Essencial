package ua.com.itvdn.javaessencial.lecture3.hometasks.task0;

public class XMLHandler extends AbstractHandler {

    public static final String BLUE_TEXT = "\u001B[34m";


    @Override
    void create() {
        System.out.println(BLUE_TEXT + "Document XML - format is create");
    }

    @Override
    void open() {
        System.out.println(BLUE_TEXT + "Document XML - format is opens");
    }

    @Override
    void change() {
        System.out.println(BLUE_TEXT + "Document XML - format was changed");
    }

    @Override
    void save() {
        System.out.println(BLUE_TEXT + "Document XML - format was saved");
    }
}
