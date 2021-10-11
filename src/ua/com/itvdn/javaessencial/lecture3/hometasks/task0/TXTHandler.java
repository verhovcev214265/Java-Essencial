package ua.com.itvdn.javaessencial.lecture3.hometasks.task0;

public class TXTHandler extends AbstractHandler {

    public static final String PURPLE_TEXT = "\u001B[35m";

    @Override
    void create() {
        System.out.println(PURPLE_TEXT + "Document TXT - format is creates");
    }

    @Override
    void open() {
        System.out.println(PURPLE_TEXT + "Document TXT - format is opens");
    }

    @Override
    void change() {
        System.out.println(PURPLE_TEXT + "Document TXT - format was changed");
    }

    @Override
    void save() {
        System.out.println(PURPLE_TEXT + "Document TXT - format was saved");
    }
}
