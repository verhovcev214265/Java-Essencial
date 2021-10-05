package ua.com.itvdn.javaessencial.lecture0.hometask.task2;

public class Content {

    private String content = "Read this book and you will have a good knowledge for Java";

    public void show(){
        System.out.println("Content: " + content);
    }

    @Override
    public String toString() {
        return "Content: '" + content + ".";

    }
}
