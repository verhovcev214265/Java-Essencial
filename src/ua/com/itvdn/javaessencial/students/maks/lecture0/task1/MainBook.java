package ua.com.itvdn.javaessencial.students.maks.lecture0.task1;

public class MainBook {
    public static void main(String[] args) {
        Author authorsName = new Author();
        authorsName.setAuthorsName("Jules Verne");

        Title bookTitle = new Title();
        bookTitle.setBookTitle("20000 Leagues Under the Sea");

        Content content = new Content();
        content.setContent("The title refers to the distance, not depth," +
                " traveled under the various seas: 20,000 metric leagues," +
                " nearly twice the circumference of the Earth");

        Book favoriteBook = new Book(bookTitle.getBookTitle(), authorsName.getAuthorsName(), content.getContent());
        favoriteBook.show();
    }
}
