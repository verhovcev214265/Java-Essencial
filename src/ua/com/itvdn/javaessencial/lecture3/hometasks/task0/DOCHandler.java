package ua.com.itvdn.javaessencial.lecture3.hometasks.task0;

public class DOCHandler extends AbstractHandler {

    public static final String RESET_TEXT = "\u001B[0m";

    @Override
    void create() {
        System.out.println(RESET_TEXT + "Document DOC - format is creates");
    }

    @Override
    void open() {
        System.out.println(RESET_TEXT + "Document DOC - format is opens");
    }

    @Override
    void change() {
        System.out.println(RESET_TEXT + "Document DOC - format was changed");
    }

    @Override
    void save() {
        System.out.println(RESET_TEXT + "Document DOC - format was saved");
    }
}
