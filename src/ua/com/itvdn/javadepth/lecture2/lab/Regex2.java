package ua.com.itvdn.javadepth.lecture2.lab;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Дана строка 'aa aba abba abbba abca abea'. Напишите регулярное выражение, которая найдет строки aa, aba, abba, abbba по
//шаблону: буква 'a', буква 'b' любое количество раз (в том числе ниодного раза), буква 'a'. Выведите строки на консоль

public class Regex2 {
    public static void main(String[] args) {

        String myText = "'aa aba abba abbba abca abea'.";
        Pattern pattern = Pattern.compile("ab*a");
        Matcher matcher = pattern.matcher(myText);

        while (matcher.find()){
            System.out.println(myText);
        }
    }
}
