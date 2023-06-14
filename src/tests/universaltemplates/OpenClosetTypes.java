package tests.universaltemplates;
import java.util.List;
import java.util.ArrayList;

public class OpenClosetTypes {
    public static void main(String[] args) {

        List l = new ArrayList();
        List<String> ls = new ArrayList<>();

        ls = l;
        ls.add("Hello Interface`m a closed type");

//        String str = l.get(0); error (class Object)

        l = ls;
        l.add("Hello Interface`m a open type");

        String s = ls.get(0);
        System.out.println(s);
    }

}
