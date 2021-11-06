package ua.com.itvdn.javadepth.lecture2.lab;

//Дана строка 'ahb acb aeb aeeb adcb axeb'. Напишите регулярное выражение, которая найдет строки ahb, acb, aeb по
//шаблону: буква 'a', любой символ, буква 'b'. Выведите строки на консоль

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {

    public static void main(String[] args) {
        String myText = "'ahb acb aeb aeeb adcb axeb'.";
        Pattern pattern = Pattern.compile("a.b");
        Matcher matcher = pattern.matcher(myText);
        while (matcher.find()) {
            System.out.println(myText);
        }
    }
}