package ua.com.itvdn.javadepth.lecture2.lab;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Дана строка “Versions: Java  5, Java 6, Java   7, Java 8.”  Найти все подстроки "Java X" и распечатать их.

public class Regex3 {
    public static void main(String[] args) {

        String myText = "“Versions: Java  5, Java 6, Java   7, Java 8.”";
        Pattern pattern = Pattern.compile("Java\\s+\\d");
        Matcher matcher = pattern.matcher(myText);
        while (matcher.find()) {
           String groups = matcher.group();
           System.out.println(groups);

        }

    }
}
