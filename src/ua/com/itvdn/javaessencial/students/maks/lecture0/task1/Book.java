package ua.com.itvdn.javaessencial.students.maks.lecture0.task1;

/*
Используя IDEA, создайте проект c пакетом.
Требуется: Создать класс Book(Main). Создать классы Title, Author и Content, каждый из которых должен
содержать одно строковое поле и метод void show (). Реализуйте возможность добавления в книгу
названия книги, имени автора и содержания. Выведите на экран при помощи метода show() название
книги, имя автора и Содержание.
 */

public class Book {

    protected class Title extends Book {
        String bookTitle;

        protected void setBookTitle(String bookTitle) {
            this.bookTitle = bookTitle;
        }

        protected void show() {
            System.out.println(bookTitle);
        }
    }

    protected class Author extends Book {
        String authorName;

        protected void setAuthorName(String authorName) {
            this.authorName = authorName;
        }

        protected void show() {
            System.out.println(authorName);
        }
    }

    protected class Content extends Book {
        String content;

        protected void setContent(String content) {
            this.content = content;
        }

        protected void show() {
            System.out.println(content);
        }
    }


}
