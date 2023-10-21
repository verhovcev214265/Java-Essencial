package ua.com.itvdn.javaessencial.students.maks.lecture0.task1;

public class Main {
    public static void main(String[] args) {

        Author author = new Author();
        author.setAuthor("Charles Dickens");

        Title title = new Title();
        title.setTitle("My first novel");

        Content content = new Content();
        content.setContent("About me");

        author.show();
        title.show();
        content.show();

        Book book = new Book(title.getTitle(), author.getAuthor(), content.getContent());
        System.out.println(book);


    }
}
