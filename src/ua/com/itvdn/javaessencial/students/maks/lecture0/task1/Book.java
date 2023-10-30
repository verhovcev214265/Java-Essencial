package ua.com.itvdn.javaessencial.students.maks.lecture0.task1;

/*
Используя IDEA, создайте проект c пакетом.
Требуется: Создать класс Book. Создать классы Title, Author и Content, каждый из которых должен
содержать одно строковое поле и метод void show (). Реализуйте возможность добавления в книгу
названия книги, имени автора и содержания. Выведите на экран при помощи метода show() название
книги, имя автора и Содержание.
 */

public class Book {
    private String title;
    private String author;
    private String content;

    public Book(String bookTitle, String authorsName, String content) {
        this.title = bookTitle;
        this.author = authorsName;
        this.content = content;
    }

    public void show() {
        System.out.println(title + "\n" + author + "\n" + content);
    }
}
