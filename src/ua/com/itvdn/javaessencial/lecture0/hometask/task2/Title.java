package ua.com.itvdn.javaessencial.lecture0.hometask.task2;

public class Title {

    private String title = "Thinking in Java";

    public void show(){
        System.out.println("Title: " + title);
    }

    @Override
    public String toString() {
        return"Title: '" + title + ".";


    }
}
