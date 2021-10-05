package ua.com.itvdn.javaessencial.lecture0.hometask.task2;

public class Author {

    private String author = "Bruce Eckel";

    public void show(){
        System.out.println("Author: " + author);
    }

    @Override
    public String toString() {
        return "Author: '" + author + ".";
    }
}
