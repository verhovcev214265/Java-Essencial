package ua.com.itvdn.javaessencial.students.maks.lecture0.task1;

/*
Используя IDEA, создайте проект c пакетом.
Требуется: Создать класс Book(Main). Создать классы Title, Author и Content, каждый из которых должен
содержать одно строковое поле и метод void show (). Реализуйте возможность добавления в книгу
названия книги, имени автора и содержания. Выведите на экран при помощи метода show() название
книги, имя автора и Содержание.
 */

public class Book {

    // Перероби завдання так щоб класи Title, Author, Content щоб вони не були статичними.

    public static class Title {
        String bookTitle;

        public void show() {
            System.out.println(bookTitle);
        }
    }

    public static class Author {
        String authorName;

        public void show() {
            System.out.println(authorName);
        }
    }

    public static class Content {
        String content;

        public void show (){
            System.out.println(content);
        }
    }

    public static void main(String[] args) {
        Title bookTitle = new Title();
        Author authorName = new Author();
        Content content = new Content();

        bookTitle.bookTitle = "Black Beard";
        authorName.authorName = "Melnychenko Maksim";
        content.content = "This book about adventures of Black Beard, who was the capitan of pirate team.";

        bookTitle.show();
        authorName.show();
        content.show();
    }
}
