package ua.com.itvdn.javaessencial.lecture0.hometask.task2;

//Требуется: Создать класс Book(Main). Создать классы Title, Author и Content, каждый из которых должен
//содержать одно строковое поле и метод void show (). Реализуйте возможность добавления в книгу
//названия книги, имени автора и содержания. Выведите на экран при помощи метода show() название
//книги, имя автора и Содержание.

public class BookMain {
    public static void main(String[] args) {

        Title title = new Title();
        title.show();

        Author author = new Author();
        author.show();

        Content content = new Content();
        content.show();

//        System.out.println(title + "\n" + author + "\n" + content);
    }
}
